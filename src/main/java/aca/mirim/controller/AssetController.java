package aca.mirim.controller;



import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aca.mirim.domain.AccountVO;
import aca.mirim.domain.DepositVO;
import aca.mirim.domain.Search;
import aca.mirim.domain.WithdrawVO;
import aca.mirim.service.AssetService;

@Controller
public class AssetController {
	
	@Autowired
	AssetService accService;

	@GetMapping("/account")
	public void account(Model model) {
		System.out.println("account get");
		 
		model.addAttribute("bank",accService.getBank());
	}
	
	@PostMapping("/account")
	public String accountpost(AccountVO vo,RedirectAttributes redirect) {
		System.out.println("account post");
		
		if(accService.accountchk(vo.getAccount())) {
			redirect.addAttribute("code", 2);
			return "redirect:/status";
		}
		
		accService.insertaccount(vo);
	
		return "/index";
	}
	
	@GetMapping("/deposit")
	public void deposit(Model model, HttpSession session) {
		System.out.println("deposit get");
		String id = (String) session.getAttribute("login");

		model.addAttribute("account",accService.getAccount(id));
		
	}
	
	@PostMapping("/deposit")
	public String depositpost(DepositVO vo,RedirectAttributes redirect) {
		System.out.println("deposit post");
		accService.insertdeposit(vo);

		redirect.addAttribute("code", 4);
		return "redirect:/status";
	}
	
	
	@GetMapping("/withdraw")
	public void withdraw(Model model, HttpSession session) {
		System.out.println("withdraw get");
		String id = (String) session.getAttribute("login");
		model.addAttribute("account",accService.getAccount(id));
	}
	
	
	@PostMapping("/withdraw")
	public String withdrawpost(WithdrawVO vo,RedirectAttributes redirect) {
		System.out.println("withdraw post");
		accService.insertwithdraw(vo);

		redirect.addAttribute("code", 5);
		return "redirect:/status";
	}
	
	
	@GetMapping("/breakdown")
	public void breakdown() {
		System.out.println("breakdown get");
		 
	}
	
	@GetMapping("/calendar")
	public String calendar(Model model) {
		model.addAttribute("calendar","1");	
		return "breakdown";
	}
	
	@PostMapping("/calendar")
	public String calendarpost(Model model, HttpSession session, Date date) {
		String id = (String) session.getAttribute("login");
		model.addAttribute("calendar","1");	
		if(accService.getCalendar("deposit", id, date)==null) {
			model.addAttribute("caldep",0);	
		}
		else {
			model.addAttribute("caldep",accService.getCalendar("deposit", id, date));	
		}
		
		if(accService.getCalendar("withdraw", id, date)==null) {
			model.addAttribute("calwith",0);	
		}
		else {
			
			model.addAttribute("calwith",accService.getCalendar("withdraw", id, date));	
		}
		

		
		return "breakdown";
	}
	
	
	
	@GetMapping("/graph")
	public String graph(Model model,HttpSession session) {
		String id = (String) session.getAttribute("login");
		model.addAttribute("graph","1");
		model.addAttribute("depmon", accService.getGraph("deposit", id, ""));
		model.addAttribute("deptues", accService.getGraph("deposit", id, "+1"));
		model.addAttribute("depwednes", accService.getGraph("deposit", id, "+2"));
		model.addAttribute("depthurs", accService.getGraph("deposit", id, "+3"));
		model.addAttribute("depfri", accService.getGraph("deposit", id, "+4"));
		model.addAttribute("depsatur", accService.getGraph("deposit", id, "+5"));
		model.addAttribute("depsun", accService.getGraph("deposit", id, "+6"));
		
		
		model.addAttribute("withmon", accService.getGraph("withdraw", id, ""));
		model.addAttribute("withtues", accService.getGraph("withdraw", id, "+1"));
		model.addAttribute("withwednes", accService.getGraph("withdraw", id, "+2"));
		model.addAttribute("withthurs", accService.getGraph("withdraw", id, "+3"));
		model.addAttribute("withfri", accService.getGraph("withdraw", id, "+4"));
		model.addAttribute("withsatur", accService.getGraph("withdraw", id, "+5"));
		model.addAttribute("withsun", accService.getGraph("withdraw", id, "+6"));
		
		
		
		return "breakdown";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("selectlist","1");
		return "breakdown";
	}
	
	@PostMapping("/list")
	public String listpost(Search search, Model model, HttpSession session) {
		System.out.println("breakdown post");
		String id = (String)session.getAttribute("login");
		
		System.out.println("searchVO " + search);
		model.addAttribute("selectlist","1");
		model.addAttribute("type",search.getType());
		model.addAttribute("account",search.getAccount());
		model.addAttribute("term",search.getTerm());
		
		
		if(search.getType()==1) {
			model.addAttribute("list",accService.getDeposit(id, search));
			
		}
		
		if(search.getType()==2) {
			model.addAttribute("list",accService.getWithdraw(id, search));
		}
		
		if(search.getAccount()==2) {
			model.addAttribute("accountlist", accService.getAccount(id));
		}
		
		return "/breakdown";
	}
	
	@PostMapping("/accountlist")
	public String accountpost(Search search, String accountlist, Model model, HttpSession session) {
		System.out.println("accountlist post");
		String id = (String)session.getAttribute("login");
		
		model.addAttribute("selectlist","1");
		model.addAttribute("account","2");
		model.addAttribute("type",search.getType());	
		model.addAttribute("term",search.getTerm());
		model.addAttribute("accountlist", accService.getAccount(id));
		
		if(search.getType()==1) {
			model.addAttribute("list",accService.getDepAccount(id, search, accountlist));
			
		}
		
		if(search.getType()==2) {
			model.addAttribute("list",accService.getWithAccount(id, search, accountlist));
		}

		
		return "/breakdown";
	}
	
	
	
	
	@GetMapping("/dep")
	public String getdep(@RequestParam("code")int code, Model model,HttpSession session) {
		
		String id = (String)session.getAttribute("login");
		
		model.addAttribute("type","1");
		model.addAttribute("content",accService.seldeposit(code));
		model.addAttribute("account",accService.getAccount(id));
		
		return "/get";
		
	}
	
	@GetMapping("/with")
	public String getwith(@RequestParam("code")int code, Model model,HttpSession session) {
		
		String id = (String)session.getAttribute("login");
		
		model.addAttribute("type","2");
		model.addAttribute("content",accService.selwithdraw(code));
		model.addAttribute("account",accService.getAccount(id));
		
		return "/get";
		
	}
	
	@GetMapping("/deletedep")
	public String deletedep(@RequestParam("code")int code) {
		accService.deletedeposit(code);
		return "/breakdown";	
	}
	
	@GetMapping("/deletewith")
	public String deletewith(@RequestParam("code")int code) {
		accService.deletewithdraw(code);
		return "/breakdown";	
	}
	
	
	@PostMapping("/updatedep")
	public String updatedep(DepositVO vo) {
		accService.updatedeposit(vo);
		return "/breakdown";	
	}
	
	@PostMapping("/updatewith")
	public String updatewith(WithdrawVO vo) {
		accService.updatewithdraw(vo);
		return "/breakdown";	
	}
	
	
}

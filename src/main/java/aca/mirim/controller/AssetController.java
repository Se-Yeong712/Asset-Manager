package aca.mirim.controller;



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
			return "redirect:/fail";
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
	public String depositpost(DepositVO vo) {
		System.out.println("deposit post");
		accService.insertdeposit(vo);

		
		return "/index";
	}
	
	
	@GetMapping("/withdraw")
	public void withdraw(Model model, HttpSession session) {
		System.out.println("withdraw get");
		String id = (String) session.getAttribute("login");
		model.addAttribute("account",accService.getAccount(id));
	}
	
	
	@PostMapping("/withdraw")
	public String withdrawpost(WithdrawVO vo) {
		System.out.println("withdraw post");
		accService.insertwithdraw(vo);

		
		return "/index";
	}
	
	
	@GetMapping("/breakdown")
	public void breakdown() {
		System.out.println("breakdown get");
		 
	}
	
	@PostMapping("/breakdown")
	public String breakdownpost(Search search, Model model, HttpSession session) {
		System.out.println("breakdown post");
		String id = (String)session.getAttribute("login");
		if(search.getType()==1) {
			System.out.println("search 1");
			model.addAttribute("type","1");
			model.addAttribute("list",accService.getDeposit(id));
		}
		else if(search.getType()==2){
			System.out.println("search 2");
			model.addAttribute("type","2");
			model.addAttribute("list", accService.getWithdraw(id));
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

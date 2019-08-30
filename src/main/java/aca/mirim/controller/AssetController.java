package aca.mirim.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import aca.mirim.domain.AccountVO;
import aca.mirim.service.AccountService;

@Controller
public class AssetController {
	
	@Autowired
	AccountService accService;

	@GetMapping("/account")
	public void account(Model model) {
		System.out.println("account get");
		 
		model.addAttribute("bank",accService.getBank());
	}
	
	@PostMapping("/account")
	public String accountpost(AccountVO vo) {
		System.out.println("account post");
		accService.insertaccount(vo);
	
		return "/index";
	}
	
	@GetMapping("/deposit")
	public void deposit(Model model, HttpSession session) {
		System.out.println("deposit get");
		String id = (String) session.getAttribute("login");
		System.out.println(id);
		model.addAttribute("account",accService.getAccount(id));
		
	}
	
	
	@GetMapping("/withdraw")
	public void withdraw() {
		System.out.println("withdraw get");
	}
	
	
}

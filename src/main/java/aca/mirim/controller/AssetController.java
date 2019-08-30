package aca.mirim.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import aca.mirim.domain.AccountVO;
import aca.mirim.domain.DepositVO;
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
	public String accountpost(AccountVO vo) {
		System.out.println("account post");
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
	
	
}

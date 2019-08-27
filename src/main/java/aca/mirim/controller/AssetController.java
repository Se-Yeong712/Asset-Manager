package aca.mirim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import aca.mirim.domain.AccountVO;
import aca.mirim.service.AccountService;

@Controller
public class AssetController {
	
	@Autowired
	AccountService accService;

	@GetMapping("/account")
	public void account() {
		System.out.println("account get");
	}
	
	@PostMapping("/account")
	public String accountpost(AccountVO vo) {
		System.out.println("account post");
		accService.insertaccount(vo);
	
		return "/index";
	}
	
	
}

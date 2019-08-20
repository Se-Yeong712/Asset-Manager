package aca.mirim.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import aca.mirim.domain.LoginDTO;
import aca.mirim.domain.MemberVO;
import aca.mirim.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memService;

	@GetMapping("/index")
	public void index() {
		System.out.println("index get");
	}
	
	@GetMapping("/login")
	public void login() {
		System.out.println("login get");
	}
	
	@PostMapping("/login")
	public String loginpost(LoginDTO dto,HttpSession session) {
		System.out.println("login post " + dto);
		MemberVO vo = memService.login(dto);
		if(vo==null) {
			return "/login";
		}
		session.setAttribute("login", vo.getId());
		
		
		return "/index";
	
	}
	
	
	
	
}

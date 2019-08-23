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

	//메인화면
	@GetMapping("/index")
	public void index() {
		System.out.println("index get");
	}
	
	//로그인
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
	
	//회원가입
	@GetMapping("/signup")
	public void signup() {
		System.out.println("signup get");
	}
	
	@PostMapping("/signup")
	public String signuppost(MemberVO vo) {
		System.out.println("signup post ");
		
		
		if(memService.checkId(vo.getId()) == null) {
			System.out.println("if 같은 아이디 없음.");
			memService.insertMember(vo);
			
			return "redirect:/index";
		}
		
		return "/signup";
	}
	
	//아이디중복체크
	@GetMapping("/checkid")
	public String checkId(HttpSession session) {
		System.out.println("id get");
		
		return "/index";
	}
	
	
	//로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("logout get");
		session.removeAttribute("login");
		
		return "/index";
	}
	
	
	
	
	
}

package aca.mirim.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String loginpost(LoginDTO dto,HttpSession session,RedirectAttributes redirect) {
		System.out.println("login post " + dto);
		MemberVO vo = memService.login(dto);
		if(vo==null) {
			redirect.addAttribute("code", 1);
			return "redirect:/fail";
		}
		session.setAttribute("login", vo.getId());
		
		
		return "/index";
	
	}
	

	@GetMapping("/signup")
	public void signup() {
		System.out.println("signup get");
	}
	
	@PostMapping("/signup")
	public String signuppost(MemberVO vo, HttpSession session) {
		System.out.println("signup post ");
		
		memService.insertMember(vo);
		session.removeAttribute("check");
		
		return "redirect:/login";
	}

	@GetMapping("/checkid")
	public void checkId() {
		System.out.println("id get");
		
	}
	
	@PostMapping("/checkid")
	public void checkIdpost(String id, HttpSession session) {
		System.out.println("id post");
		
		if(memService.checkId(id) == null) {
			System.out.println("if안 ID 사용가능.");
			session.setAttribute("id",id);
			session.setAttribute("check","1");
		}
		else {
			session.setAttribute("check","0");
		}

	}
	
	

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("logout get");
		session.removeAttribute("login");
		
		return "/index";
	}
	
	
	@GetMapping("/findinfo")
	public void findinfo() {
		System.out.println("find infomation get");
	}
	
	
	@PostMapping("/findinfo")
	public void findinfopost() {
		System.out.println("find info post");
	}
	
	
	
	@PostMapping("/findid")
	public String findid(String pw,String name,HttpSession session) {
		System.out.println("find id "+ pw + name);
		String id = memService.findid(pw, name);
		session.setAttribute("result", id);
		System.out.println("id");
		
		return "/findresult";
		
	}
	
	@PostMapping("/findpw")
	public String findpw(String id, String name) {
		System.out.println("find pw "+ id + name);
		String pw = memService.findid(id, name);
		System.out.println(pw);
		return "/findresult";
		
	}

	
	@GetMapping("findresult")
	public void findresult() {
		System.out.println("findresult");
	}
	
	@GetMapping("/fail")
	public void fail(@RequestParam("code")int code, Model model) {
		System.out.println("fail" + code);
		if(code==1) {
			model.addAttribute("msg","아이디 또는 비밀번호를 다시 확인하세요.");
			model.addAttribute("url","/login");
		}
		if(code==2) {
			model.addAttribute("msg","이미 등록된 계좌입니다.");
			model.addAttribute("url","/account");
		}
		
	}
}

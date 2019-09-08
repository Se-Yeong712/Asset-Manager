package aca.mirim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/menu")
	public void menu(){
		System.out.println("menu get");
		
	}

}

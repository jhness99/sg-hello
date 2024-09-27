package com.shinogod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String helloPage(Model model) {
		
		model.addAttribute("greeting", "리로이ㅣㅣㅣㅣㅣ 젠킨스");
		return "hello";
	}
}

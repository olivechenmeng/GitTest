package com.zrht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	public String test() {
		System.out.println("test2");
		System.out.println("I have resolved the conflict");
		return "success";
	}
}

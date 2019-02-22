package com.nginx002.demo.test.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestControl {
	
	@GetMapping("/index")
	public String index() {
		return "main";
	}
	
	@GetMapping("/login/{name}")
	public String login(@PathVariable("name")String name,HttpServletRequest request) {
		System.out.println("002----name----"+name);
		request.getSession().setAttribute("name", name);
		return "redirect:/index";
	}
	
	@GetMapping("/logout/{name}")
	public String logout(@PathVariable("name")String name,HttpServletRequest request) {
		System.out.println("002----name----"+name);
		request.getSession().removeAttribute("name");
		return "redirect:/index";
	}

}

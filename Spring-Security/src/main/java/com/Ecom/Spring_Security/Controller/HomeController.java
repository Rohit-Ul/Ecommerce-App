package com.Ecom.Spring_Security.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Secure")
public class HomeController {
	
	private List<Integer> lst=new ArrayList<>();
	@GetMapping("/getCsrfToken")
	public CsrfToken getCsrfToken(HttpServletRequest Request) {
		
		return (CsrfToken)Request.getAttribute("_csrf");
	}
	
	@GetMapping("/Hii")
	public String Greet() {
		return "Hello Rohit!";
	}
	
	@GetMapping("/about")
	public String About(HttpServletRequest request) {
		return "About Rohit!!"+request.getSession().getId();
	}
	
	@PostMapping("/add/{num}")
	public List<Integer> addnewElement(@PathVariable Integer num){
		
		lst.add(num);
		return lst;
	}
}

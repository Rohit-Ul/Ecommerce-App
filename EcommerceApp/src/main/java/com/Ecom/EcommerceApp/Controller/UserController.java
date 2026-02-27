package com.Ecom.EcommerceApp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Ecom.EcommerceApp.model.App_User;
import com.Ecom.EcommerceApp.model.Users;
import com.Ecom.EcommerceApp.repo.UserRepo;
import com.Ecom.EcommerceApp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/signIn")
	public Users AuthUser(Users user) {
		return null;
	}
	
	@GetMapping("/finduser")
	public Optional<Users> GetUser(@RequestParam("username") String username) {
		
		System.out.println("Searching For :"+username);
		return service.findUser(username);
	}
}

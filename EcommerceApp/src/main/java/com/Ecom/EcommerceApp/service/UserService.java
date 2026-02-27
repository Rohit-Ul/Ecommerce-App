package com.Ecom.EcommerceApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecom.EcommerceApp.model.App_User;
import com.Ecom.EcommerceApp.model.Users;
import com.Ecom.EcommerceApp.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo repo;
	
	public Optional<Users> findUser(String user){
		
		return repo.findByUsername(user);
	}
}

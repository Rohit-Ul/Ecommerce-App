package com.Ecom.EcommerceApp.service;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Ecom.EcommerceApp.model.UserDetailsImpl;
import com.Ecom.EcommerceApp.model.Users;
import com.Ecom.EcommerceApp.repo.UserRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		System.out.println("Searching for :"+ username);
		System.out.println("🔍 INPUT BYTES: {"+Arrays.toString(username.getBytes(StandardCharsets.UTF_8))+"}");
		Users user= userRepo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User Notb Found!!"+username)); 
		
		System.out.println("User Found :"+ user);

		if(user == null) {
			throw new UsernameNotFoundException("User 404");
		}
		else {
			return new UserDetailsImpl(user);
		}
		
	
	}

}

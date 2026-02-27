package com.Ecom.EcommerceApp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Ecom.EcommerceApp.model.App_User;
import com.Ecom.EcommerceApp.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer>{
	
//	@Query("""
//		       SELECT p
//		       FROM Users p
//		       WHERE LOWER(p.username)  = LOWER(:username)
//		          
//		       """)
	Optional<Users> findByUsername(String username);
}

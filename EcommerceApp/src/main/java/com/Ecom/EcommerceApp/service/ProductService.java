package com.Ecom.EcommerceApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecom.EcommerceApp.model.Product;
import com.Ecom.EcommerceApp.repo.Repo;

@Service
public class ProductService {
	@Autowired
	Repo repo;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(new Product());	
	}

	
	
}

package com.Ecom.EcommerceApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecom.EcommerceApp.model.Product;
import com.Ecom.EcommerceApp.service.ProductService;


@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	ProductService service;
	
	@GetMapping("/Products")
	@ResponseBody
	public List<Product> getProducts() {
		System.out.println("Fetching Products...");
		return service.getAllProducts();
	}
	
	@GetMapping("/Product/{id}")
	public Product getProduct(@PathVariable int id) {
		System.out.println("Finding Product....");
 		return service.getProduct(id);
	}
	@PostMapping("/Products")
	public Product addProducts(@RequestBody Product product) {
		System.out.println("Adding Product..."+ product);
		
		return service.addProduct(product);
	}
}

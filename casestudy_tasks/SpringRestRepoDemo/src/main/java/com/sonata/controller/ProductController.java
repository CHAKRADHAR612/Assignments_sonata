package com.sonata.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.model.Product;
import com.sonata.repository.ProductRepository;

@RestController
public class ProductController {
	@Autowired
	private ProductRepository repository;
	
	Optional<Product> p1;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		System.out.println(repository.findAll());
		return (List<Product>) repository.findAll();
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity getProduct(@PathVariable Long id) {
		p1=repository.findById(id);
		return ResponseEntity.ok().body(p1);
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prd) {
		repository.save(prd);
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity updateProduct(@PathVariable Long id,@Valid @RequestBody Product prd) {
		p1=repository.findById(id);
		Product p2=p1.get();
		p2.setProductId(prd.getProductId());
		p2.setProductName(prd.getProductName());
		p2.setProductPrice(prd.getProductPrice());
		Product updatedProduct=repository.save(p2);
		return ResponseEntity.ok(updatedProduct);
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity deleteProduct(@PathVariable Long id) {
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}

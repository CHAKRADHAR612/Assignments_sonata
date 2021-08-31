package com.casestudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.model.Login;
import com.casestudy.repository.LoginRepository;

@RestController
public class LoginController {
	@Autowired
	private LoginRepository repository;
	
	@GetMapping("/users")
	public List<Login> getAllUsers(){
		System.out.println(repository.findAll());
		return (List<Login>) repository.findAll();
	}
	
	@GetMapping("/users/{user}")
	public Login getUser(@PathVariable String user) {
		Login login=repository.findByUser(user);
		return login;
	}
	
	@PostMapping("/users")
	public String addUser(@RequestBody Login login) {
		repository.save(login);
		return "User created successfully";
	}
	
	@PutMapping("/users/{user}")
	public String modifyUser(@PathVariable String user,@RequestBody Login login) {
		Login login1=repository.findByUser(user);
		login1.setUser(login.getUser());
		login1.setPassword(login.getPassword());
		repository.save(login1);
		return "Login data modified successfully";
	}
	
	@DeleteMapping("/users/{user}")
	public String deleteUser(@PathVariable String user) {
		repository.delete(repository.findByUser(user));
		return "Login data deleted successfully";
	}
	
}

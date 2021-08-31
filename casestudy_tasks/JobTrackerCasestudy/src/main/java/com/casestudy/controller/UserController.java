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

import com.casestudy.model.User;
import com.casestudy.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/myusers")
	public List<User> getAllUsers(){
		return (List<User>) repository.findAll();
	}
	
	@GetMapping("/myusers/{user_id}")
	public User getUser(@PathVariable Integer user_id){
		User user=repository.findById(user_id).get();
		return  user;
	}
	
	@PostMapping("/myusers")
	public String regUser(@RequestBody User user) {
		repository.save(user);
		return "User registered successfully";
	}
	
	@PutMapping("/myusers/{user_id}")
	public String regUser(@PathVariable Integer user_id,@RequestBody User user) {
		User user1=repository.findById(user_id).get();
		user1.setUser_name(user.getUser_name());
		user1.setPassword(user.getPassword());
		user1.setEmail(user.getEmail());
		user1.setFirst_name(user.getFirst_name());
		user1.setLast_name(user.getLast_name());
		user1.setMobile_no(user.getMobile_no());
		user1.setRole(user.getRole());
		user1.setDob(user.getDob());
		user1.setCreated_on(user.getCreated_on());
		repository.save(user1);
		return "User Data updated successfully";
	}
	
	@DeleteMapping("/myusers/{user_id}")
	public String deleteUser(@PathVariable Integer user_id) {
		repository.delete(repository.findById(user_id).get());
		return "User deleted successfully";
	}
}

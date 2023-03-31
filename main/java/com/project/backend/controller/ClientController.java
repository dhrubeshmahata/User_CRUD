package com.project.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend.model.User;
import com.project.backend.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ClientController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String helloworld() {
		return "Hello World";
	}
	
	//Rest API
	
	// Create User - POST
	
	@PostMapping("/add")
	public User createUser(@RequestBody User user) {
		User user1 = userService.createUser(user);
		return user1;
	}
	
	// Read users - GET
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	// Update users by Id - PUT
	
	@PutMapping("/update/{id}")
	public User updateUserById(@RequestBody User user, @PathVariable("id") long id) {
		return userService.updateUser(user, id);
	}
	
	//Delete users by Id - DELETE
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id) {
		userService.deleteUser(id);
		return "User Deleted Successfully..";
		
	}
	
	// Get user By id
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id") long id) {
		return userService.getUserById(id);
		
	}

}

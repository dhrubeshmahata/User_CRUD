package com.project.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.backend.model.User;

@Service
public interface UserService {
	
	//create a user
	public User createUser(User user);
	
	
	//read users
	public List<User> getUsers();
	
	
	//read user by Id
	public User getUserById(long id);
	
	
	//delete user by Id
	public void deleteUser(long id);
	
	
	//update user by Id
	public User updateUser(User user, long id);
	
	
	

}

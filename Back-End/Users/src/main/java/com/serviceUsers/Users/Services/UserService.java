package com.serviceUsers.Users.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.serviceUsers.Users.Models.User;

@Service
public interface UserService {
	
	public List<User> findAllUsers();
	
	public User saveUser(User user);

}

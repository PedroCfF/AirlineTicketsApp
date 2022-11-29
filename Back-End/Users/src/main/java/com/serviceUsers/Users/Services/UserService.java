package com.serviceUsers.Users.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviceUsers.Users.Models.User;
import com.serviceUsers.Users.Repo.UsersRepo;

@Service
public class UserService {
	
	@Autowired
	UsersRepo usersRepo;
	
	public List<User> findAllUsers(){
		return usersRepo.findAllUsers();
	}

}

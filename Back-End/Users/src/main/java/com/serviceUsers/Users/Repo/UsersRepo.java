package com.serviceUsers.Users.Repo;

import java.util.List;

import com.serviceUsers.Users.Models.User;

public interface UsersRepo {
	
	public List<User> findAllUsers();

}

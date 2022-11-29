package com.serviceUsers.Users.Repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.serviceUsers.Users.Models.User;

@Component
public class UsersRepoImpl implements UsersRepo {
	
	List<User> usersList = new ArrayList<User>();

	@Override
	public List<User> findAllUsers() {
		return usersList;
	}

}

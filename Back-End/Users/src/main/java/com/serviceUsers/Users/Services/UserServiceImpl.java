package com.serviceUsers.Users.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.serviceUsers.Users.Models.User;
import com.serviceUsers.Users.Repo.UsersRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UsersRepo usersRepo;
	
	public List<User> findAllUsers(){
		return usersRepo.findAll();
	}

	@Override
	public User saveUser(User user) {
		
		List<User> users = usersRepo.findAll();
	
		for(User u: users)
		{
		    if(u.id.equals(user.id))
		    {
		    	user.flights.add(u.flights.get(0));	    	
		    	usersRepo.save(user);
		    	return user;
		    }	    
		}	
		usersRepo.save(user);
		return user;
		
		
	}

}

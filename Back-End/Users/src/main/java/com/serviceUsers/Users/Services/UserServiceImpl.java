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
		
		usersRepo.save(user);
		
		List<User> users = usersRepo.findAll();
	
		for(User u: users)
		{
		    if(u.id.equals(user.id))
		    {
		    	System.out.println("holi1");
//		    	user.flights.add(u.flights.get(0));
//		    	usersRepo.save(user);
		    }
		    else
		    {
		    	System.out.println("holi2");
//		    	usersRepo.save(user);
		    }			    
		}
		
		return user;
	}

}

package com.serviceUsers.Users.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviceUsers.Users.Models.User;
import com.serviceUsers.Users.Services.UserService;

@RestController
@RequestMapping("users")
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping()
	public ResponseEntity<List<User>> fetchAllTeams() throws Exception {

		List<User> listOfUsers = userService.findAllUsers();

		return new ResponseEntity<>(listOfUsers, HttpStatus.OK);
	}
	
	
	
	@PostMapping()
	public ResponseEntity<User> saveTeam(@RequestBody User user) throws Exception {

		userService.saveUser(user);
		
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}

}

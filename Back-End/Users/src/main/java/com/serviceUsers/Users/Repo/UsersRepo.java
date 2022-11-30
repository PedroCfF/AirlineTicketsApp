package com.serviceUsers.Users.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.serviceUsers.Users.Models.User;

public interface UsersRepo extends MongoRepository<User, String>{}

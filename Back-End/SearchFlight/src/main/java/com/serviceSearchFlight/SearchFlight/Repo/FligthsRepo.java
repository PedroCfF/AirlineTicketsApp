package com.serviceSearchFlight.SearchFlight.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.serviceSearchFlight.SearchFlight.Models.Flight;

public interface FligthsRepo extends MongoRepository<Flight, String> {}

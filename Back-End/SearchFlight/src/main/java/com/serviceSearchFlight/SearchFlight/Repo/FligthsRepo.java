package com.serviceSearchFlight.SearchFlight.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.serviceSearchFlight.SearchFlight.Models.FlightOrigin;

public interface FligthsRepo extends MongoRepository<FlightOrigin, String> {
}

package com.serviceUsers.Users.Models;

import java.util.List;

public class User {
	public String id;
	public String name;
	public String lastName;
	public String nie;
	public String passport;
	public String email;
	public List<UserFlight> userFlights;
	public List<Baggage> userBaggages;
}


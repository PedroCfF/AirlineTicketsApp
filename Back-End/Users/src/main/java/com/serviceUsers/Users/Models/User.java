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
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNie() {
		return nie;
	}
	public void setNie(String nie) {
		this.nie = nie;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<UserFlight> getUserFlights() {
		return userFlights;
	}
	public void setUserFlights(List<UserFlight> userFlights) {
		this.userFlights = userFlights;
	}
	public List<Baggage> getUserBaggages() {
		return userBaggages;
	}
	public void setUserBaggages(List<Baggage> userBaggages) {
		this.userBaggages = userBaggages;
	}
}


package com.serviceUsers.Users.Models;

import java.util.List;
import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class User {
	
	public String id;
	public String name;
	public String lastname;
	public String nie;
	public String passport;
	public String email;
	public List<Flight> flights;
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public List<Flight> getFlights() {
		return flights;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, flights, id, lastname, name, nie, passport);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(flights, other.flights)
				&& Objects.equals(id, other.id) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(name, other.name) && Objects.equals(nie, other.nie)
				&& Objects.equals(passport, other.passport);
	}
	
	

	
	
}


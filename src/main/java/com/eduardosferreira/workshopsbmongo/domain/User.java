package com.eduardosferreira.workshopsbmongo.domain;

import java.io.Serializable;

import com.eduardosferreira.workshopsbmongo.exception.DomainRunTimeException;
import com.eduardosferreira.workshopsbmongo.model.People;

public class User extends People implements Serializable, Comparable<User> {
	
	private static final long serialVersionUID = 1L;
	private String email;
	
	public String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}

	public User(String id, String name, String email) {
		super(id,name);
		this.setEmail(email);
	}
	
	public User(String name, String email) {
		super(name);
		if (email == null || email.trim().equals("")) 
			throw new DomainRunTimeException("Invalid Argument! " + email);
			
		this.setEmail(email);
	}
	@Override
	public String toString() {
		return "User [" + super.toString() + ", email=" + this.getEmail() + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.getId() == null) ? 0 : this.getId().hashCode());
		return result;
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
		if (this.getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!this.getId().equals(other.getId()))
			return false;
		return true;
	}
	@Override
	public int compareTo(User o) {
		return o.getId().trim().toUpperCase().compareToIgnoreCase(this.getId().trim().toUpperCase());
	}
	
	

}

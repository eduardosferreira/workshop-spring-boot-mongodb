package com.eduardosferreira.workshopsbmongo.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.eduardosferreira.workshopsbmongo.domain.exception.DomainRunTimeException;

@Document(collection="user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String name;
	private String email;
	
	
	public String getId() {
		return id;
	}
	protected void setId(String id) {
		if (id == null || id.trim().equals("") || id.trim().equals("0")) 
			throw new DomainRunTimeException("Invalid Argument! " + id);
		
		this.id = id;
	}
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		if (name == null || name.trim().equals("")) 
			throw new DomainRunTimeException("Invalid Argument! " + name);

		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		if (email == null || email.trim().equals("")) 
			throw new DomainRunTimeException("Invalid Argument! " + email);

		this.email = email;
	}

	private User() {
		super();
	}
	
	public User(String id, String name, String email) {
		this();
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
	}
	
	@Override
	public String toString() {
		return "User [" + "id= " + this.getId() + ", name= " + this.getName() + ", email=" + this.getEmail() + "]";
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
	

}

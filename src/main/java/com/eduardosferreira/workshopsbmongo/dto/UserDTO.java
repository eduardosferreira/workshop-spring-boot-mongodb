package com.eduardosferreira.workshopsbmongo.dto;

import java.io.Serializable;

import com.eduardosferreira.workshopsbmongo.domain.User;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String email;

	private UserDTO() {
		super();
	}
	public UserDTO(User user) {
		this();
		this.setId(user.getId());
		this.setName(user.getName());
		this.setEmail(user.getEmail());
	}
	public String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	public User fromDTO(UserDTO objtDTO) {
		return new User(objtDTO.getId(), objtDTO.getName(), objtDTO.getEmail());
	}
	public User fromDTO(String id, String name, String email) {
		return new User(id,name,email);
	}

	
	@Override
	public String toString() {
		return "UserDTO [id= " + this.getId() + ", name= " + this.getName() + ", email= " + this.getEmail() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		UserDTO other = (UserDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}

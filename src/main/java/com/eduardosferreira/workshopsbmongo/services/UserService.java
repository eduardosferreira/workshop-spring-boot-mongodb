package com.eduardosferreira.workshopsbmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardosferreira.workshopsbmongo.domain.User;
import com.eduardosferreira.workshopsbmongo.dto.UserDTO;
import com.eduardosferreira.workshopsbmongo.repository.UserRepository;
import com.eduardosferreira.workshopsbmongo.services.exception.ObjectNotFoundRunTimeException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repositoryUser;
	
	
	public List<User> findAllUser(){
		return repositoryUser.findAll();
	}

	public User findByUser(String id) {
		Optional<User> objUser = repositoryUser.findById(id);
		return objUser.orElseThrow(() -> new ObjectNotFoundRunTimeException("Object Not Found!"));
	}
	
	public User insertUser(User user) {
		return repositoryUser.insert(user);
	}

	public void deleteUser(String id) {
		findByUser(id);
		repositoryUser.deleteById(id);;
	}

	public User fromDTO(UserDTO objtDTO) {
		return new User(objtDTO.getId(), objtDTO.getName(), objtDTO.getEmail());
	}
	public User fromDTO(String id, String name, String email) {
		return new User(id,name,email);
	}
	
}

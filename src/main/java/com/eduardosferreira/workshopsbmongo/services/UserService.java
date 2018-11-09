package com.eduardosferreira.workshopsbmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardosferreira.workshopsbmongo.domain.User;
import com.eduardosferreira.workshopsbmongo.repository.UserRepository;
import com.eduardosferreira.workshopsbmongo.services.exception.ObjectNotFoundRunTimeException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repositoryUser;
	
	
	public List<User> findAll(){
		return repositoryUser.findAll();
	}

	public User findByUser(String id) {
		Optional<User> objUser = repositoryUser.findById(id);
		return objUser.orElseThrow(() -> new ObjectNotFoundRunTimeException("Object Not Found!"));
	}
		
}

package com.eduardosferreira.workshopsbmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardosferreira.workshopsbmongo.domain.User;
import com.eduardosferreira.workshopsbmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repositoryUser;
	
	
	public List<User> findAll(){
		
		return repositoryUser.findAll();
	}

}

package com.eduardosferreira.workshopsbmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eduardosferreira.workshopsbmongo.domain.User;
import com.eduardosferreira.workshopsbmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	private UserService serviceUser;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
/*		return ResponseEntity.ok().body(Arrays.asList(new User("Maria", "m1@gmail.com")
							,new User("Alex", "a1@gmail.com")
							));*/
		return ResponseEntity.ok().body(serviceUser.findAll());
	}
}

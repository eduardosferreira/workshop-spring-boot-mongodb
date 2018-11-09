package com.eduardosferreira.workshopsbmongo.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eduardosferreira.workshopsbmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok().body(Arrays.asList(new User("Maria", "m1@gmail.com")
							,new User("Alex", "a1@gmail.com")
							));
	}
}

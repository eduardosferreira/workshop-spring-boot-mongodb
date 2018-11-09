package com.eduardosferreira.workshopsbmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eduardosferreira.workshopsbmongo.domain.User;
import com.eduardosferreira.workshopsbmongo.dto.UserDTO;
import com.eduardosferreira.workshopsbmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	private UserService serviceUser;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findAll() {

		List<User> listUser = serviceUser.findAll();
		List<UserDTO> listUserDTO  = listUser.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(listUserDTO);
	}
}

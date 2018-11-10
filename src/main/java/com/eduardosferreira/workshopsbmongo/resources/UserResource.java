package com.eduardosferreira.workshopsbmongo.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

		List<User> listUser = serviceUser.findAllUser();
		List<UserDTO> listUserDTO  = listUser.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(listUserDTO);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<UserDTO> findById(@PathVariable String id) {
		User objUser = serviceUser.findByUser(id);
		return ResponseEntity.ok().body(new UserDTO(objUser));
	}

	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody UserDTO objtDTO) {
		User objUser = serviceUser.fromDTO(objtDTO);
		objUser = serviceUser.insertUser(objUser);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(objUser.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	
}

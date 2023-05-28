package com.project.aws;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Controller {

	@GetMapping("/get")
	public ResponseEntity<List<User>> getUser()
	{
		User u= new User(1L,"Soundariya");
		User u1= new User(2L,"Harikrishnan");
		
		List<User> userList= Arrays.asList(u,u1);
		return new ResponseEntity<>(userList,HttpStatus.CREATED);
		
	}
}

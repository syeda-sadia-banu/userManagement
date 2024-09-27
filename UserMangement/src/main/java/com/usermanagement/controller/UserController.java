package com.usermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagement.model.Users;
import com.usermanagement.service.UsersService;

@RestController
public class UserController {
	
	@Autowired
	private UsersService service;
	@PostMapping("/user")
	public String addUsers(@RequestBody Users user) {
		return "added successfully"+ service.addUser(user);
	}
	@GetMapping("/getAll")
	public List<Users> getUser() {
		return service.getUser();
	}

}

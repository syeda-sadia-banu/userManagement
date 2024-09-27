package com.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagement.model.Roles;
import com.usermanagement.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService service;
	@PostMapping("/addRole")
	public String addRole(@RequestBody Roles role){
		
		service.add(role);
		return "added";
	}
	

}

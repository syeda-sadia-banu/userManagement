package com.usermanagement.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagement.model.Users;
import com.usermanagement.service.UsersService;

@RestController
public class UserController {

	@Autowired
	private UsersService service;
     @PostMapping("/users")
	public ResponseEntity<Users> createUser(@RequestBody Users user, @RequestParam Set<String> roles) {
		return ResponseEntity.ok(service.createUser(user, roles));

	}
     @DeleteMapping("/{id}")
     public ResponseEntity<Void> deleteUser(@PathVariable int id){
    	 service.deleteUser(id);
    	 return ResponseEntity.noContent().build();
     }
     @GetMapping("/users")
    public ResponseEntity<List<Users>> getUserByRole(@RequestParam String role){
    	return ResponseEntity.ok(service.getUserByRole(role));
    }
	@PutMapping("/users/{id}")
	public ResponseEntity<Users> updateUser(@PathVariable int id, Users user){
		return ResponseEntity.ok(service.updateUser(id, user));
	}

}

package com.usermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermanagement.model.Roles;
import com.usermanagement.model.Users;
import com.usermanagement.repo.RoleRepsoitory;
import com.usermanagement.repo.UserRepository;
@Service
public class UsersService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepsoitory roleRepository;

	public Users addUser(Users user) {
		return userRepository.save(user);
		
	}

	public List<Users> getUser() {
		
	  return userRepository.findAll();
	}
	
	/*public Users linkUserWithRoles(int userId, List<Integer> roleId) {
		
		Users user=userRepository.findById(userId).orElseThrow(()->new RuntimeException("user not found"));
		List<Roles> role=roleRepository.findAllById(roleId);
		
		return userRepository.save(user);
		
	}*/
	
	

	

	 

}

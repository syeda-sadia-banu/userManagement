package com.usermanagement.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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
	public Users createUser(Users user,Set<String> roleNames) {
    	Set<Roles> roles=roleNames.stream()
    			         .map(roleRepository::findByRoleName)
    			         .filter(Optional::isPresent)
    			         .map(Optional::get)
    			         .collect(Collectors.toSet());
    	   user.setRoles(roles);
    	   return userRepository.save(user);
    }
	public void deleteUser(int id) {
		roleRepository.deleteById(id);
		
	}
	
	public List<Users> getUserByRole(String roleName){
		return userRepository.findByRoles_RoleName(roleName);
	}
    
	
	
	

	

	 

}

package com.usermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermanagement.model.Roles;
import com.usermanagement.repo.RoleRepsoitory;

@Service
public class RoleService {
	@Autowired
	private RoleRepsoitory repo;

	public Roles add(Roles role) {
		return repo.save(role);
		
	}
	

}

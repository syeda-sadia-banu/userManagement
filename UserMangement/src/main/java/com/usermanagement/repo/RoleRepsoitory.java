package com.usermanagement.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagement.model.Roles;

public interface RoleRepsoitory  extends JpaRepository<Roles, Integer>{

	

}

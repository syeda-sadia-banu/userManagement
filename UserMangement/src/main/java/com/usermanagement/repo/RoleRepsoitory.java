package com.usermanagement.repo;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usermanagement.model.Roles;
@Repository
public interface RoleRepsoitory  extends JpaRepository<Roles, Integer>{
     
	 Optional<Roles> findByRoleName(String roleName);
	

}

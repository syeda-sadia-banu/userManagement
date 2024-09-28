package com.usermanagement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagement.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

	List<Users> findByRoles_RoleName(String roleName);

}

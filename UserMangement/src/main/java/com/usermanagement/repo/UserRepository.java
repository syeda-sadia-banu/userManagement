package com.usermanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagement.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}

package com.usermanagement.model;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	@ManyToMany
	@JoinTable(name="user_roles",
	             joinColumns = @JoinColumn(name="user_id"),
	             inverseJoinColumns = @JoinColumn(name="role_id"))
	private Set<Roles> roles;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int userId, String userName, String userPassword, String userEmail, Set<Roles> roles) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.roles = roles;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Set<Roles> getRoles() {
		return roles;
	}
	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}
	public int getUserId() {
		return userId;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userEmail="
				+ userEmail + ", roles=" + roles + "]";
	} 
	
	

	

	
}

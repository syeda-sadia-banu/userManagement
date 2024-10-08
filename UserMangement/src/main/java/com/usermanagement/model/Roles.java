package com.usermanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	private String roleName;
	
	/*@ManyToMany(mappedBy = "roles",cascade = CascadeType.ALL)
	private List<Users> users;*/

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roles(int roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/*public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}*/

	public int getRoleId() {
		return roleId;
	}

	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", roleName=" + roleName +  "]";
	}
	
	
	
	
	
	


	
}

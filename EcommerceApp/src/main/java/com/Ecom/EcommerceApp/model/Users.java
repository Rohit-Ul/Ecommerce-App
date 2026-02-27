package com.Ecom.EcommerceApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ecom_users")
public class Users {

	@Id
	@Column(name = "user_id")
	private int UID;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "pass")
	private String password;
	
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		this.UID = uID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Users [UID=" + UID + ", Username=" + username + ", password=" + password + "]";
	}
	
}

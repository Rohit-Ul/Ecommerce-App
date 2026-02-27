package com.Ecom.EcommerceApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ecom_users")
public class App_User {
	
	@Override
	public String toString() {
		return "App_User [UID=" + this.UID + ", name=" + this.name + ", password=" + this.password + "]";
	}

	@Id
	@Column(name = "user_id")
	private int UID;
	
	@Column(name = "username")
	private String name;
	
	@Column(name = "pass")
	private String password;
	
	public int getUID() {
		return this.UID;
	}

	public void setUID(int uID) {
		this.UID = uID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

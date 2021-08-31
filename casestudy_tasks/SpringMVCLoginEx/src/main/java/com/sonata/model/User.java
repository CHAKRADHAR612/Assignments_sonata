package com.sonata.model;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class User {
	@NotNull
	private String userName;
	@NotNull
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
}

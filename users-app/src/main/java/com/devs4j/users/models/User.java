package com.devs4j.users.models;

public class User {
	private String nickName;
	private String username;
	private String password;
	
	public User(String nickName, String username, String password) {
		super();
		this.nickName = nickName;
		this.username = username;
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

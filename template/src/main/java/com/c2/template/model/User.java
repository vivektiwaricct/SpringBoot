package com.c2.template.model;

import java.io.Serializable;

public class User implements Serializable {
	private Long userId;
	private String username;

	public User() {
	}

	public User(Long userId, String username) {
		this.userId = userId;
		this.username = username;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}

package com.entity;

public class Infor {
	private String name;
	private String password;

	public Infor(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public Infor() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Infor [name=" + name + ", password=" + password + "]";
	}

}

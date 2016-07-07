package com.bean;

public class User {
	private String fname;
	private String fback;
	public String getName() {
		return fname;
	}
	public void setName(String name) {
		this.fname = fname;
	}
	public String getFeedback() {
		return fback;
	}
	public void setFeedback(String feedback) {
		this.fback = fback;
	}
	@Override
	public String toString() {
		return "User [name=" + fname + ", feedback=" + fback + "]";
	}
	
}

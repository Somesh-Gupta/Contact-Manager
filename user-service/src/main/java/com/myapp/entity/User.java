package com.myapp.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int userId;
	private String userName;
	private String mobileNumber;
	private List<Contact> contacts;

	public User(int userId, String userName, String mobileNumber) {
		this.userId = userId;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.contacts = new ArrayList<>();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}

package com.myapp.entity;

public class Contact {

	private int contactId;
	private String contactName;
	private String contactMobileNumber;
	private int userId;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactMobileNumber() {
		return contactMobileNumber;
	}

	public void setContactMobileNumber(String contactMobileNumber) {
		this.contactMobileNumber = contactMobileNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Contact(int contactId, String contactName, String contactMobileNumber, int userId) {
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactMobileNumber = contactMobileNumber;
		this.userId = userId;
	}

}

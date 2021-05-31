package com.myapp.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.myapp.entity.Contact;

@Service
public class ContactsService {

	List<Contact> contacts = Arrays.asList(new Contact(1, "John", "423423", 1), new Contact(2, "Harry", "123123", 2),
			new Contact(3, "Thomas", "567567", 2), new Contact(4, "Rio", "788788", 3));

	public Contact getContact(int contactId) {
		return contacts.stream().filter(id -> id.getContactId() == contactId).findAny().orElse(null);
	}

	public List<Contact> getContactsByUserId(int userId) {
		return contacts.stream().filter(contact -> contact.getUserId() == userId).collect(Collectors.toList());
	}

}

package com.myapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.entity.Contact;
import com.myapp.service.ContactsService;

@RestController
@RequestMapping("/contact")
public class ContactsController {

	// Constructor injection
	// No need to annotate with @Autowired if only one constructor
	private final ContactsService contactsService;

	public ContactsController(ContactsService contactsService) {
		this.contactsService = contactsService;
	}

	@GetMapping("/{contactId}")
	public Contact getContact(@PathVariable int contactId) {
		return contactsService.getContact(contactId);
	}
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContactsByUserId(@PathVariable int userId) {
		return contactsService.getContactsByUserId(userId);
	}
}

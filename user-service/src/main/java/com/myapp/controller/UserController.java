package com.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.myapp.entity.Contact;
import com.myapp.entity.User;
import com.myapp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	// Constructor injection
	// No need to annotate with @Autowired if only one constructor
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/{userId}")
	public User getUser(@PathVariable int userId) {

		User user = userService.getUser(userId);
		
		List<Contact> contacts = this.restTemplate.getForObject("http://contacts-service:8002/contact/user/" + userId, List.class);
		
		user.setContacts(contacts);
		
		return user;
	}
}

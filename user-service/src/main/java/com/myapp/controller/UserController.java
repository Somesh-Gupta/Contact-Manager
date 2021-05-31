package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.entity.User;
import com.myapp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	// Constructor injection
	// No need to annotate with @Autowired if only one constructor
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/{userId}")
	public User getUser(@PathVariable int userId) {
		return userService.getUser(userId);
	}
}

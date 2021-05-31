package com.myapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.myapp.entity.User;

@Service
public class UserService {

	List<User> users = Arrays.asList(new User(1, "John", "423423"), new User(2, "Harry", "123123"),
			new User(3, "Thomas", "567567"), new User(4, "Rio", "788788"));

	public User getUser(int userId) {
		return users.stream().filter(id -> id.getUserId() == userId).findAny().orElse(null);
	}

}
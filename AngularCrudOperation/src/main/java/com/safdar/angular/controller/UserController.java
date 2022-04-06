package com.safdar.angular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.safdar.angular.model.Login;
import com.safdar.angular.model.UserDetails;
import com.safdar.angular.service.UserService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping(path = "/login",consumes = "application/json")
	public UserDetails login(@RequestBody Login loginCred) {
		System.out.println("From Controller--> Login");
		return userService.loginUSer(loginCred);
	}
	
	@PostMapping(path = "/signUp")
	public String registerUser(@RequestBody UserDetails user) {
		
		return userService.addUser(user);
				
	}

}

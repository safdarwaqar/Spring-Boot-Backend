package com.safdar.angular.service;


import com.safdar.angular.model.Login;
import com.safdar.angular.model.UserDetails;

public interface UserService {
	
	public String addUser(UserDetails userDetails);
	public UserDetails loginUSer(Login login);
	public String DeleteUser(Long id);
	
	

}

package com.safdar.angular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safdar.angular.model.Login;
import com.safdar.angular.model.UserDetails;
import com.safdar.angular.repository.UserRepository;

@Service
public class UserImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public String addUser(UserDetails userDetails) {
		UserDetails user = new UserDetails();
		user.setUsername(userDetails.getUsername());
		user.setEmail(userDetails.getEmail());
		user.setPhone(userDetails.getPhone());
		user.setPassword(userDetails.getPassword());
		userRepository.save(user);
		System.out.println(user);
		return "User Successfully Added....\n" + user.toString();
	}

	@Override
	public UserDetails loginUSer(Login user) {

		UserDetails fetchedUser = new UserDetails();

		Iterable<UserDetails> userList = userRepository.findAll();

		for (UserDetails checkUsers : userList) {
			if (user.getUsername().equals(checkUsers.getUsername())
					&& user.getPassword().equals(checkUsers.getPassword())) {
				fetchedUser.setEmail(checkUsers.getEmail());
				fetchedUser.setUsername(checkUsers.getUsername());
				fetchedUser.setPhone(checkUsers.getPhone());
				fetchedUser.setPassword(checkUsers.getPassword());

				System.out.println("Login Success!!");
				return fetchedUser;

			}

		}
		if (fetchedUser.getUsername() == null) {
			fetchedUser = null;
		}
		return fetchedUser;

	}

	@Override
	public String DeleteUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.ms.springxmlconfig.service;

import java.util.List;

import com.ms.springxmlconfig.model.User;
import com.ms.springxmlconfig.repository.UserRepository;

public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.springxmlconfig.service.UserService#getUsers()
	 */
	@Override
	public List<User> getUsers() {
		return userRepository.getUser();
	}

	// uses setter injection
	public void setUserRepository(UserRepository userRepository) {
		System.out.println("---- setUserRepository method invoked using SETTER injection ----");
		this.userRepository = userRepository;
	}

}

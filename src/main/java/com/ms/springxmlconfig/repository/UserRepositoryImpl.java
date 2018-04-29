package com.ms.springxmlconfig.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.ms.springxmlconfig.model.User;

public class UserRepositoryImpl implements UserRepository {

	private String usernameInJavaClass;

	@Value("${passwordInPropertiesFile}")
	private String passwordInJavaClass;

	public void setUsernameInJavaClass(String usernameInJavaClass) {
		this.usernameInJavaClass = usernameInJavaClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.springxmlconfig.repository.UserRepository#getUser()
	 */
	@Override
	public List<User> getUser() {
		System.out.println("user name in properties file = " + usernameInJavaClass);
		System.out.println("password in properties file = " + passwordInJavaClass);
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setUserName("MS");
		users.add(user);
		return users;
	}

}

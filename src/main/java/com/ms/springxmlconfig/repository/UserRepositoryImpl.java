package com.ms.springxmlconfig.repository;

import java.util.ArrayList;
import java.util.List;

import com.ms.springxmlconfig.model.User;

public class UserRepositoryImpl implements UserRepository {

	/* (non-Javadoc)
	 * @see com.ms.springxmlconfig.repository.UserRepository#getUser()
	 */
	@Override
	public List<User> getUser() {
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setUserName("MS");
		users.add(user);
		return users;
	}

}

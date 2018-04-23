package com.ms.springxmlconfig.repository;

import java.util.List;

import com.ms.springxmlconfig.model.User;

public interface UserRepository {

	List<User> getUser();

}
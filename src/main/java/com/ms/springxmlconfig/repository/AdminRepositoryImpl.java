package com.ms.springxmlconfig.repository;

import java.util.ArrayList;
import java.util.List;

import com.ms.springxmlconfig.model.Admin;

public class AdminRepositoryImpl implements AdminRepository {

	/* (non-Javadoc)
	 * @see com.ms.springxmlconfig.repository.AdminRepository#getAdmin()
	 */
	@Override
	public List<Admin> getAdmin() {
		List<Admin> admins = new ArrayList<>();
		Admin admin = new Admin();
		admin.setUserName("MS");
		admin.setRole("Admin");
		admins.add(admin);
		return admins;
	}

}

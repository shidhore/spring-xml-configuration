package com.ms.springxmlconfig.repository;

import java.util.ArrayList;
import java.util.List;

import com.ms.springxmlconfig.model.GuestPass;

public class GuestPassRepositoryImpl implements GuestPassRepository {

	/* (non-Javadoc)
	 * @see com.ms.springxmlconfig.repository.GuestPassRepository#getGuestPasses()
	 */
	@Override
	public List<GuestPass> getGuestPasses() {
		List<GuestPass> guestPasses = new ArrayList<>();
		GuestPass guestPass = new GuestPass();
		guestPass.setPassNumber("1");
		guestPasses.add(guestPass);
		return guestPasses;
	}

}

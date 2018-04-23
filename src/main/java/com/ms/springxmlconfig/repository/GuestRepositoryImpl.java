package com.ms.springxmlconfig.repository;

import java.util.ArrayList;
import java.util.List;

import com.ms.springxmlconfig.model.Guest;

public class GuestRepositoryImpl implements GuestRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.springxmlconfig.repository.GuestRepository#getGuests()
	 */
	@Override
	public List<Guest> getGuests() {
		List<Guest> guests = new ArrayList<>();
		Guest guest = new Guest();
		guest.setUserName("Guest");
		guests.add(guest);
		return guests;
	}

}

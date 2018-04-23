package com.ms.springxmlconfig.service;

import java.util.List;

import com.ms.springxmlconfig.model.Guest;
import com.ms.springxmlconfig.model.GuestPass;

public interface GuestService {

	List<Guest> getGuests();
	
	List<GuestPass> getGuestPasses();

}
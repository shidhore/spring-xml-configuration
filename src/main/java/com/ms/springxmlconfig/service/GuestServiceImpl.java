package com.ms.springxmlconfig.service;

import java.util.List;

import com.ms.springxmlconfig.model.Guest;
import com.ms.springxmlconfig.model.GuestPass;
import com.ms.springxmlconfig.repository.GuestPassRepository;
import com.ms.springxmlconfig.repository.GuestRepository;

public class GuestServiceImpl implements GuestService {

	private GuestRepository guestRepository;
	private GuestPassRepository guestPassRepository;

	// A default constructor is needed here because we have 2 bean references (bean
	// name="guestServ" & bean name="guestService") to GuestServiceImpl in
	// applicationContext.xml file which means 2 instances of GuestServiceImpl are
	// being created. In order for autowire byType to work for the 2nd bean (bean
	// name="guestService"), it needs a default constructor.
	public GuestServiceImpl() {

	}

	public GuestServiceImpl(GuestRepository guestRepository) {
		System.out.println("---- GuestServiceImpl constructor invoked using CONSTRUCTOR injection ----");
		this.guestRepository = guestRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.springxmlconfig.service.GuestService#getGuests()
	 */
	@Override
	public List<Guest> getGuests() {
		return guestRepository.getGuests();
	}

	public void setGuestPassRepository(GuestPassRepository guestPassRepository) {
		System.out.println("---- setGuestPassRepository method invoked using SETTER injection ----");
		this.guestPassRepository = guestPassRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.springxmlconfig.service.GuestService#getGuestPasses()
	 */
	@Override
	public List<GuestPass> getGuestPasses() {
		return guestPassRepository.getGuestPasses();
	}

}

package com.ms.springxmlconfig.repository;

import java.util.List;

import com.ms.springxmlconfig.model.Guest;

public interface GuestRepository {

	List<Guest> getGuests();

}
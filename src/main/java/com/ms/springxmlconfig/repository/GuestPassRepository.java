package com.ms.springxmlconfig.repository;

import java.util.List;

import com.ms.springxmlconfig.model.GuestPass;

public interface GuestPassRepository {

	List<GuestPass> getGuestPasses();

}
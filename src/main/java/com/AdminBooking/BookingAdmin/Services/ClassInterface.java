package com.AdminBooking.BookingAdmin.Services;

import com.AdminBooking.BookingAdmin.Entity.AdminDetails;

public interface ClassInterface {
	public AdminDetails AddAdminData(AdminDetails details);
	public AdminDetails getAdminDetails(int PlaceId);
	public AdminDetails findById(int PlaceId);
	void DeleteAdminDetails (int PlaceId);

}
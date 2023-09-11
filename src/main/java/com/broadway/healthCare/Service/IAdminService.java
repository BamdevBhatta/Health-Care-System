package com.broadway.healthCare.Service;

import com.broadway.healthCare.model.Admin;

public interface IAdminService {
	void addAdmin();

	void deleteAdmin(int id);

	Admin validAdmin(String name, String password);
}

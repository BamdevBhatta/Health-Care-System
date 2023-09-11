package com.broadway.healthCareService.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.broadway.healthCare.Repository.AdminRepository;
import com.broadway.healthCare.Service.IAdminService;
import com.broadway.healthCare.model.Admin;
@Service
public class AdminServiceImpl implements IAdminService {
	@Autowired
	private AdminRepository adminrepo;

	@Override
	public void addAdmin() {

	}

	@Override
	public void deleteAdmin(int id) {

	}

	@Override
	public Admin validAdmin(String name, String password) {
		return adminrepo.findByNameAndPassword(name, password);
	}

}

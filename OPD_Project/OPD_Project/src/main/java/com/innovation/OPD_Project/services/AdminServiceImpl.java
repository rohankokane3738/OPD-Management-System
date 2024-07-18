package com.innovation.OPD_Project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.OPD_Project.Repository.AdminRepository;
import com.innovation.OPD_Project.model.Admin;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	@Qualifier("admRepo")
	AdminRepository admRepo;
	
	@Override
	public Admin login(String em, String ps) {
		// TODO Auto-generated method stub
		return admRepo.findByEmailAndPassword(em, ps);
	}

}

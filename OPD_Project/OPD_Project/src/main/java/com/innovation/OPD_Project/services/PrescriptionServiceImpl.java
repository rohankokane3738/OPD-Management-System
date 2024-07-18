package com.innovation.OPD_Project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.OPD_Project.Repository.PrescriptionRepository;
import com.innovation.OPD_Project.model.Appointment;
import com.innovation.OPD_Project.model.Prescription;

@Service
public class PrescriptionServiceImpl implements PrescriptionService{
@Autowired
@Qualifier("presRepo")
PrescriptionRepository presRepo;
	@Override
	public Prescription insert(Prescription ps) {
		// TODO Auto-generated method stub
		return presRepo.save(ps);
	}
	

	@Override
	public Prescription update(long pid, Prescription ps) {
		Optional<Prescription> opt=presRepo.findById(pid);
		if(opt.isPresent())
		{
			Prescription pr=opt.get();
		    pr.setAid(ps.getAid());
		    pr.setMedicine(ps.getMedicine());
		    pr.setSuggestion(ps.getSuggestion());
		return presRepo.save(pr);
		}
		return null;
	}

	@Override
	public Prescription search(long pid) {
		Optional<Prescription> opt=presRepo.findById(pid);
		if(opt.isPresent())
		{
			Prescription pr=opt.get();
		    
		return pr;
		}
		return null;
	}

	@Override
	public List<Prescription> getAll() {
		// TODO Auto-generated method stub
		return presRepo.findAll();
	}


	@Override
	public List<Prescription> getAllByApp(long aid) {
		// TODO Auto-generated method stub
		return presRepo.findAllByAid(aid);
	}

}

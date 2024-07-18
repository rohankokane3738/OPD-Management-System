package com.innovation.OPD_Project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.OPD_Project.Repository.AppointmentRepository;
import com.innovation.OPD_Project.model.Appointment;

@Service
public class AppointmentServiceImpl implements AppointmentService {
@Autowired
@Qualifier("apRepo")
AppointmentRepository apRepo;

	@Override
	public Appointment insert(Appointment ap) {
		// TODO Auto-generated method stub
		return apRepo.save(ap);
	}

	@Override
	public void delete(long aid) {
		apRepo.deleteById(aid);
	}

	@Override
	public Appointment update(long aid, Appointment ap) {
		// TODO Auto-generated method stub
		Optional<Appointment> opt=apRepo.findById(aid);
		if(opt.isPresent())
		{
			Appointment app=opt.get();
			app.setPid(ap.getPid());
			app.setDt(ap.getDt());
			app.setStatus(ap.getStatus());
			app.setTm(ap.getTm());
		return apRepo.save(app);
		}
		return null;
	}

	@Override
	public Appointment search(long aid) {
		Optional<Appointment> opt=apRepo.findById(aid);
		if(opt.isPresent())
		{
			Appointment app=opt.get();
			
		return app;
		}
		return null;
	}

	@Override
	public List<Appointment> getAll() {
		// TODO Auto-generated method stub
		return apRepo.findAll();
	}

}

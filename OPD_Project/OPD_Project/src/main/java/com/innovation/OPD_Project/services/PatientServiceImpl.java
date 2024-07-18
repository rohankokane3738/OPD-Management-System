package com.innovation.OPD_Project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.OPD_Project.Repository.AppointmentRepository;
import com.innovation.OPD_Project.Repository.PatientRepository;
import com.innovation.OPD_Project.model.Appointment;
import com.innovation.OPD_Project.model.Patient;
@Service
public class PatientServiceImpl implements PatientService {
@Autowired
@Qualifier ("patientRepo")
PatientRepository patientRepo;
	@Override
	public Patient insert(Patient p) {
		// TODO Auto-generated method stub
		return patientRepo.save(p);
	}

	@Override
	public void delete(long pid) {
		// TODO Auto-generated method stub
		patientRepo.deleteById(pid);;;
	}

	@Override
	public Patient update(long pid, Patient p) {
		// TODO Auto-generated method stub
		Optional<Patient> opt=patientRepo.findById(pid);
		if(opt.isPresent())
		{
			Patient pp=opt.get();
			pp.setName(p.getName());
			pp.setAddress(p.getAddress());
			pp.setGender(p.getGender());
			pp.setAge(p.getAge());
			pp.setContact(p.getContact());
			pp.setEmail(p.getEmail());
			pp.setPassword(p.getPassword());
		return patientRepo.save(pp);
		}
		return null;
	}

	@Override
	public Patient search(long pid) {
		Optional<Patient> opt=patientRepo.findById(pid);
		if(opt.isPresent())
		{
			Patient pp=opt.get();
			
		return pp;
		}
		return null;
	}

	@Override
	public List<Patient> getAll() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}

	@Override
	public Patient login(String em, String ps) {
		// TODO Auto-generated method stub
		return patientRepo.findByEmailAndPassword(em, ps);
	}

}

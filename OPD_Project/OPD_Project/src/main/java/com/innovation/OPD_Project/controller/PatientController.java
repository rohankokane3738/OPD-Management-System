package com.innovation.OPD_Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovation.OPD_Project.model.Patient;
import com.innovation.OPD_Project.services.PatientService;

@RestController
@RequestMapping("/opd/")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {

	@Autowired
	PatientService ps;
	
	@GetMapping("/patient")
	public List<Patient> getAll()
	{
		return ps.getAll();
	}
	@PostMapping("/patient")
	public Patient insert(@RequestBody Patient p)
	{
		return ps.insert(p);
	}
	@DeleteMapping("/patient/{id}")
	public void delete(@PathVariable("id")long id)
	{
		ps.delete(id);
	}
	@PutMapping("/patient/{id}")
	public Patient update(@PathVariable("id")long id,@RequestBody Patient p)
	{
		return ps.update(id, p);
	}
	@GetMapping("/patient/{id}")
	public Patient search(@PathVariable("id")long id)
	{
		return ps.search(id);
	}
	@GetMapping("/patient/{email}/{password}")
	public Patient login(@PathVariable("email")String email,@PathVariable("password")String password)
	{
		return ps.login(email, password);
	}
}

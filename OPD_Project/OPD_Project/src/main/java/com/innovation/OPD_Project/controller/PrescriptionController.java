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

import com.innovation.OPD_Project.model.Prescription;
import com.innovation.OPD_Project.services.PrescriptionService;

@RestController
@RequestMapping("/opd/")
@CrossOrigin(origins = "http://localhost:4200")
public class PrescriptionController {

	@Autowired
	PrescriptionService ps;
	
	@GetMapping("/Prescription")
	public List<Prescription> getAll()
	{
		return ps.getAll();
	}
	@PostMapping("/Prescription")
	public Prescription insert(@RequestBody Prescription c)
	{
		return ps.insert(c);
	}
	
	@PutMapping("/Prescription/{id}")
	public Prescription update(@PathVariable("id")long id,@RequestBody Prescription c)
	{
		return ps.update(id, c);
	}
	@GetMapping("/Prescription/{id}")
	public Prescription search(@PathVariable("id")long id)
	{
		return ps.search(id);
	}
	@GetMapping("/Prescription/app/{id}")
	public List<Prescription> search1(@PathVariable("id")long id)
	{
		return ps.getAllByApp(id);
	}

}

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

import com.innovation.OPD_Project.model.CasePaper;
import com.innovation.OPD_Project.services.CasePaperService;

@RestController
@RequestMapping("/opd/")
@CrossOrigin(origins = "http://localhost:4200")
public class CasePaperController {
	@Autowired
    CasePaperService cs;
	
	@GetMapping("/CasePaper")
	public List<CasePaper> getAll()
	{
		return cs.getAll();
	}
	@PostMapping("/CasePaper")
	public CasePaper insert(@RequestBody CasePaper c)
	{
		return cs.insert(c);
	}
	@DeleteMapping("/CasePaper/{id}")
	public void delete(@PathVariable("id")long id)
	{
		cs.delete(id);
	}
	@PutMapping("/CasePaper/{id}")
	public CasePaper update(@PathVariable("id")long id,@RequestBody CasePaper c)
	{
		return cs.update(id, c);
	}
	@GetMapping("/CasePaper/{id}")
	public CasePaper search(@PathVariable("id")long id)
	{
		return cs.search(id);
	}


}

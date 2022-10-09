package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CollegeStaff;
import com.example.demo.service.CollegeStaffService;

@RestController
@RequestMapping("/collegestaff")
public class CollegeStaffController
{

	@Autowired
	CollegeStaffService service;
	@GetMapping("/list")
	public List<CollegeStaff> liststaff()
	{
		return service.findAll();
		
	}
	@GetMapping("/findbyid/{id}")
	public CollegeStaff findById(@PathVariable int id)
	{
		return service.findById(id);
	}
	@PostMapping("/save")
	public CollegeStaff save(@RequestBody CollegeStaff e)
	{
		e.setStaffid(0);
		service.saveorUpdate(e);
		return e;
	}
	@PutMapping("/update")
	public CollegeStaff update(@RequestBody CollegeStaff e)
	{
		service.saveorUpdate(e);
		return e;
	}
	@DeleteMapping("/delete/{id}")
	   public String delete(@PathVariable int id)
	    {
			CollegeStaff e=findById(id);
	    	if(e==null)
	    	{throw new RuntimeException("delete id not found");
	    	}
	    	else
	    	{
	    	service.deleteById(id);
	    	}
	    	return "staff_id is deleted"+id;
	    }
}

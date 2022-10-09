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

import com.example.demo.entity.CollegeStudent;
import com.example.demo.service.CollegeStudentService;

@RestController
@RequestMapping("/collegestudent")
public class CollegeStudentController {

	@Autowired
	CollegeStudentService service;
	@GetMapping("/list")
	public List<CollegeStudent> liststudent()
	{
		return service.findAll();	
	}
	@GetMapping("/findbyid/{id}")
	public CollegeStudent findById(@PathVariable int id)
	{
		return service.findById(id);
	}
	@PostMapping("/save")
	public CollegeStudent save(@RequestBody CollegeStudent e)
	{
		e.setSid(0);
		service.saveorUpdate(e);
		return e;
	}
	@PutMapping("/update")
	public CollegeStudent update(@RequestBody CollegeStudent e)
	{
		service.saveorUpdate(e);
		return e;
	}
	
	@DeleteMapping("/delete/{id}")
   public String delete(@PathVariable int id)
    {
		CollegeStudent e=findById(id);
    	if(e==null)
    	{
    		throw new RuntimeException("delete id not found");
    	}
    	else
    	{
    	service.deleteById(id);
    	}
    	return "student_id deleted"+id;
}
}
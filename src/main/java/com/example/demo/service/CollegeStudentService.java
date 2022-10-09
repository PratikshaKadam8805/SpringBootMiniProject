package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CollegeStudent;

public interface CollegeStudentService 
{
	public List<CollegeStudent>findAll();
	public CollegeStudent findById(int id);
	public void saveorUpdate(CollegeStudent c);
	public void deleteById(int id);
}

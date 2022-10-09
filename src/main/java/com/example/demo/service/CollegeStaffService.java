package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CollegeStaff;

public interface CollegeStaffService
{
	public List<CollegeStaff>findAll();
	public CollegeStaff findById(int id);
	public void saveorUpdate(CollegeStaff s);
	public void deleteById(int id);
}

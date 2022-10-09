package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dao.CollegeStaffDao;
import com.example.demo.entity.CollegeStaff;

@Service
public class CollegeStaffServiceImpl implements CollegeStaffService
{
	@Autowired
	CollegeStaffDao dao;
	@Override
	public List<CollegeStaff> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public CollegeStaff findById(@PathVariable int id) {
		// TODO Auto-generated method stub
		Optional<CollegeStaff> s=dao.findById(id);
		CollegeStaff s1=null;
		if(s.isPresent())
		{
			s1=s.get();
		}
		return s1;

	}

	@Override
	public void saveorUpdate(CollegeStaff s) {
		// TODO Auto-generated method stub
		dao.save(s);
	}


	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}
	
}

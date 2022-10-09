package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dao.CollegeStudentDao;
import com.example.demo.entity.CollegeStudent;

@Service
public class CollegeStudentServiceImpl implements CollegeStudentService
{
@Autowired
CollegeStudentDao dao;

	@Override
	public List<CollegeStudent> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public CollegeStudent findById(@PathVariable int id) {
		// TODO Auto-generated method stub
		Optional<CollegeStudent> c=dao.findById(id);
		CollegeStudent c1=null;
		if(c.isPresent())
		{
			c1=c.get();
		}
		return c1;
	}

	@Override
	public void saveorUpdate(CollegeStudent c) {
		// TODO Auto-generated method stub
		dao.save(c);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}

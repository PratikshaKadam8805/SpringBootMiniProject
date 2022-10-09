package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CollegeStaff;

public interface CollegeStaffDao extends JpaRepository<CollegeStaff  ,Integer>
{

}

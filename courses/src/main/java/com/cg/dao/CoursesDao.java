package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bean.Courses;

public interface CoursesDao extends JpaRepository<Courses,Integer>{
   
}

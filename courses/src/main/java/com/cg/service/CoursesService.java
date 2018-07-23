package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.Courses;
import com.cg.exception.CoursesException;

public interface CoursesService {
	Courses acceptCourseDetails(Courses course) throws CoursesException;
	Courses getCourseDetails(int id) throws CoursesException;
	Courses editCourseDetails(int id) throws CoursesException;
	ArrayList<Courses> getAllCourseDetails() throws CoursesException;
	
}

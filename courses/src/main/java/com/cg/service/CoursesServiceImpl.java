package com.cg.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.bean.Courses;
import com.cg.dao.CoursesDao;
import com.cg.exception.CoursesException;
@Service
@Component(value="courseservice")
public class CoursesServiceImpl implements CoursesService {
	@Autowired
    private CoursesDao dao;
	public Courses acceptCourseDetails(Courses course) throws CoursesException {
		// TODO Auto-generated method stub
		return dao.save(course);
	}

	public Courses getCourseDetails(int id) throws CoursesException {
		// TODO Auto-generated method stub
		Courses course= dao.findOne(id);
		if(course==null) {
			throw new CoursesException("Course details with" +id+ "not found");
		}
		else {
			return course;
		}
	}

	public Courses editCourseDetails(int id) throws CoursesException {
		// TODO Auto-generated method stub
		Courses course=getCourseDetails(id);
		return dao.save(course);
	}

	public ArrayList<Courses> getAllCourseDetails() throws CoursesException {
		// TODO Auto-generated method stub
		return (ArrayList<Courses>) dao.findAll() ;
	}
          
          
}

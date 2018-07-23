package com.cg.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.bean.Courses;
import com.cg.exception.CoursesException;
import com.cg.service.CoursesService;


@Controller
public class AssociateActionController {
	@Autowired(required=true)
	private CoursesService courseservice;
	
	@RequestMapping(value="/addCourse",method=RequestMethod.POST)
	public ModelAndView addCourse(@ModelAttribute("course") Courses course) {
		try {
			course =courseservice.acceptCourseDetails(course);
			ModelAndView modelAndView = new ModelAndView("AddSuccessPage", "course", course);
			return modelAndView;
		} catch (CoursesException e) {
			e.printStackTrace();
		}
		return new ModelAndView("errorPage");
	}
	

	@RequestMapping(value="/viewAllCourse",method=RequestMethod.POST)
	public ModelAndView viewCourse(@ModelAttribute("course") Courses course) {
		try {
			 ArrayList<Courses> al=courseservice.getAllCourseDetails();
			ModelAndView modelAndView = new ModelAndView("viewPage", "al", al);
			return modelAndView;
		} catch (CoursesException e) {
			e.printStackTrace();
		}
		return new ModelAndView("errorPage");
	}
	@RequestMapping(value="/editCourse",method=RequestMethod.POST)
	public ModelAndView editCourse(@ModelAttribute("course") Courses course) {
		try {
			course =courseservice.acceptCourseDetails(course);
			ModelAndView modelAndView = new ModelAndView("AddSuccessPage", "course", course);
			return modelAndView;
		} catch (CoursesException e) {
			e.printStackTrace();
		}
		return new ModelAndView("errorPage");
	}
}

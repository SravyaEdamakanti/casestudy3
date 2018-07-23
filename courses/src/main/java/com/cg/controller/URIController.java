package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.bean.Courses;


@Controller
public class URIController {
	@RequestMapping("/")
	public String getIndexPage() {
		return "indexPage";
	}
	
	
	@RequestMapping("/addCourseDetails")
	public String getRegistrationPage() {
		return "addCoursePage";
	}
	
	@ModelAttribute("courses")
		public Courses getAssociate() {
		return new Courses();
	}
		@RequestMapping("/edit")
		public String geteditPage() {
			return "CourseEditPage";
		}
	@RequestMapping("/viewAllCourseDetails")
	public String getviewPage() {
		return "viewAllCourseDetails";
	}

}
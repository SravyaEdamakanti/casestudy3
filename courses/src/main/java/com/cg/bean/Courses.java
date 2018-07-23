package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Courses {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
     String courseName;
     int Duration;
     String faculty;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", courseName=" + courseName + ", Duration=" + Duration + ", faculty=" + faculty
				+ "]";
	}
     
}

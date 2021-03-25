package com.ltts.demo.Services;

import java.util.List;

import com.ltts.demo.Entity.Course;

public interface CourseService
{

	public List<Course> getCourses();
	public Course getCourse(long courseid);
	public Course addcourse(Course c);
	public Course updatecourse(Course c);
	public Course deletecourse(int id);
}
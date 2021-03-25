package com.ltts.demo.Services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ltts.demo.Entity.Course;
@Service
public class CourseServiceImpl implements CourseService
{
	
	List<Course> list;
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Course(1,"Java Core","This book is all about Core Java"));
		list.add(new Course(2,"JavaEEE","This book is all about Java Standards"));
		list.add(new Course(3,"Java Adv","This book is all about Java Advanced"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseid) {
		// TODO Auto-generated method stub
		Course cs = null;
		for(Course c:list)
		{
			if(c.getId()==courseid)
			{
				cs=c;
				break;
			}
		}
		return cs;
	}

	@Override
	public Course addcourse(Course c) {
		// TODO Auto-generated method stub
		list.add(c);
		return c;
	}

	@Override
	public Course updatecourse(Course c) {
		// TODO Auto-generated method stub
		for(Course cs:list)
		{
			if(cs.getId()==c.getId())
			{
				int id = list.indexOf(cs);
				list.set(id, c);
			}
		}
		return c;
	}

	@Override
	public Course deletecourse(int id)
	{
		Course c1 = null;
		for(Course c:list)
		{
			if(c.getId()==id)
			{
				list.remove(c);
				c1 = c;
				break;
			}
		}
		
		return c1;
		
	}

}
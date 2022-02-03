package com.practice.first.service;

import java.util.List;
import java.util.Optional;

import com.practice.first.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Optional<Course> getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);
}

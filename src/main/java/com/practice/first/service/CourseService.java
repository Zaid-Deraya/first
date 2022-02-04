package com.practice.first.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.practice.first.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public List<Course> findCourseWithSorting(String field);

	public Page<Course> findCoursesWithPagination(int offSet, int pageSize);

	public Page<Course> findCoursesWithPaginationAndSorting(int offset, int pageSize, String field);

	public Optional<Course> getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long parseLong);
}

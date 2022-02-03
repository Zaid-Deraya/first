package com.practice.first.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.first.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}

package com.P1.elearning_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.P1.elearning_platform.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
package com.codekul.july26batch.manytomany.repository;

import com.codekul.july26batch.manytomany.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Long> {
}

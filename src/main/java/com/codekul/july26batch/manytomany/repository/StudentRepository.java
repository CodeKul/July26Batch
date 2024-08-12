package com.codekul.july26batch.manytomany.repository;

import com.codekul.july26batch.manytomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}

package com.codekul.july26batch.manytomany.repository;

import com.codekul.july26batch.manytomany.entity.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teachers,Long> {
}

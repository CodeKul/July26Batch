package com.codekul.july26batch.manytomany.repository;

import com.codekul.july26batch.manytomany.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject,Long>
{
}

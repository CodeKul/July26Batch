package com.codekul.july26batch.registration.repository;

import com.codekul.july26batch.registration.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepo extends JpaRepository<Gender,Long> {
}

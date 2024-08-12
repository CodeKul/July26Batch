package com.codekul.july26batch.ontomany.repository;

import com.codekul.july26batch.ontomany.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
}

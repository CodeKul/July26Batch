package com.codekul.july26batch.registration.repository;

import com.codekul.july26batch.registration.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration,Long> {
    Registration findByMobileNumber(Long mobileNumber);
}

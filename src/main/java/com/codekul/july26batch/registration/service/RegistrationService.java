package com.codekul.july26batch.registration.service;

import com.codekul.july26batch.registration.dto.RegistrationRequestDto;
import com.codekul.july26batch.registration.entity.Registration;

public interface RegistrationService {

    String saveRegistration(RegistrationRequestDto registration);


    Registration getByMobileNumber(Long mobileNumber);
}

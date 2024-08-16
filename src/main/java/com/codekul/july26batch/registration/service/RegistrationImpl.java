package com.codekul.july26batch.registration.service;

import com.codekul.july26batch.registration.dto.RegistrationRequestDto;
import com.codekul.july26batch.registration.entity.Registration;
import com.codekul.july26batch.registration.entity.RegistrationDetails;
import com.codekul.july26batch.registration.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationImpl implements RegistrationService{

    @Autowired
    private RegistrationRepo registrationRepo;

    @Override
    public String saveRegistration(RegistrationRequestDto registration) {

        Registration registration1 = new Registration();
        registration1.setBloodGroup(registration.getBloodGroup());
        registration1.setIsd(registration.getIsd());
        registration1.setGender(registration.getGender());

        registration1.setEmail(registration.getEmail());
        registration1.setPrefix(registration.getPrefix());
        registration1.setMaritalStatus(registration.getMaritalStatus());
        registration1.setNationality(registration.getNationality());
        registration1.setMobileNumber(registration.getMobileNumber());

        RegistrationDetails registrationDetails = new RegistrationDetails();
        registrationDetails.setDob(registration.getDob());
        registrationDetails.setFirstName(registration.getFirstName());
        registrationDetails.setLastName(registration.getLastName());

        registration1.setRegistrationDetails(registrationDetails);

        registrationRepo.save(registration1);

//        email send;
        return registration.getEmail();
    }



    @Override
    public Registration getByMobileNumber(Long mobileNumber) {
        return registrationRepo.findByMobileNumber(mobileNumber);
    }
}

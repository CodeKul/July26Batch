package com.codekul.july26batch.registration.controller;


import com.codekul.july26batch.registration.dto.RegistrationRequestDto;
import com.codekul.july26batch.registration.entity.Registration;
import com.codekul.july26batch.registration.entity.RegistrationDetails;
import com.codekul.july26batch.registration.repository.RegistrationRepo;
import com.codekul.july26batch.registration.service.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("save")
    public String saveReg(@RequestBody RegistrationRequestDto registration) {
        return registrationService.saveRegistration(registration);
    }

    @GetMapping("getByName/{mobileNumber}")
    public Registration getByName(@PathVariable Long mobileNumber) {
        return registrationService.getByMobileNumber(mobileNumber);
    }
}

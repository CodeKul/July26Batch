package com.codekul.july26batch.registration.controller;


import com.codekul.july26batch.registration.entity.Registration;
import com.codekul.july26batch.registration.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("registration")
public class RegistrationController {

    @Autowired
    private RegistrationRepo registrationRepo;

    @PostMapping("save")
    private String saveReg(@RequestBody Registration registration){
        registrationRepo.save(registration);
        return "reg saved";
    }
}

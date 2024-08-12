package com.codekul.july26batch.registration.controller;

import com.codekul.july26batch.registration.entity.Gender;
import com.codekul.july26batch.registration.repository.GenderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gender")
public class GenderController {

    @Autowired
    private GenderRepo genderRepo;

    @PostMapping("save")
    public String saveGender(@RequestBody Gender gender){
        genderRepo.save(gender);
        return "gender saved";
    }
}

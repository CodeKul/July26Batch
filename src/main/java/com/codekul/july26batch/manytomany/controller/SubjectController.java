package com.codekul.july26batch.manytomany.controller;

import com.codekul.july26batch.manytomany.entity.Subject;
import com.codekul.july26batch.manytomany.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("subject")
public class SubjectController {

    @Autowired
    private SubjectRepo subjectRepo;

    @PostMapping("save")
    public String saveSubject(@RequestBody Subject subject){
        subjectRepo.save(subject);
        return "subject saved";
    }
}

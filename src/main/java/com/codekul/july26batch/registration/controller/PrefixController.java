package com.codekul.july26batch.registration.controller;

import com.codekul.july26batch.registration.entity.Gender;
import com.codekul.july26batch.registration.entity.Prefix;
import com.codekul.july26batch.registration.repository.GenderRepo;
import com.codekul.july26batch.registration.repository.PrefixRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prefix")
public class PrefixController {

    @Autowired
    private PrefixRepo prefixRepo;

    @PostMapping("save")
    public String savePrefix(@RequestBody Prefix prefix){
        prefixRepo.save(prefix);
        return "prefix saved";
    }
}

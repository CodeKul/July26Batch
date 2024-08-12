package com.codekul.july26batch.ontomany.controller;

import com.codekul.july26batch.ontomany.entity.Customer;
import com.codekul.july26batch.ontomany.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("save")
    public String saveCustomer(@RequestBody Customer customer){
        customerRepo.save(customer);
        return "customer saved";
    }
}

package com.codekul.july26batch.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SalaryAccountRepo salaryAccountRepo;

    @PostMapping("save")
    public String saveEmployee(@RequestBody Employee employee) {
//        Employee employee1 = new Employee();
//        employee1.setName(employee.getName());
//        employee1.setAddress(employee.getAddress());
        employeeRepository.save(employee);

//        SalaryAccount salaryAccount = new SalaryAccount();
//        salaryAccount.setEmployee(employee1);
//        salaryAccount.setAccountNumber(employee.getSalaryAccount().getAccountNumber());
//        salaryAccount.setAccountType(employee.getSalaryAccount().getAccountType());
//        salaryAccountRepo.save(salaryAccount);
        return "Saved..";
    }
}

/**
 *
 * {
 *     "name":"Suhas",
 *     "address":"Pune",
 *     "salaryAccount":{
 *         "accountNumber":2929183,
 *         "accountType":"Salary"
 *     }
 * }
 */
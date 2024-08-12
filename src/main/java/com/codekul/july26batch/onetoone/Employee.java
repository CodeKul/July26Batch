package com.codekul.july26batch.onetoone;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    @JsonManagedReference
    private SalaryAccount salaryAccount;

}

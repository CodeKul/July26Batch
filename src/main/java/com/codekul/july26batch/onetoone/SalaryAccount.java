package com.codekul.july26batch.onetoone;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "salary_account")
@Setter
@Getter
public class SalaryAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long accountNumber;

    private String accountType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    @JsonBackReference
    private Employee employee;
}

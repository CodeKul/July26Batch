package com.codekul.july26batch.registration.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "prefix_id")
    @NotNull(message = "prefix can not be null")
    private Prefix prefix;

    @ManyToOne
    @JoinColumn(name = "gender_id")
    @NotNull(message = "gender can not be null")
    private Gender gender;

    @Column(length = 20)
    @NotNull(message = "first name can not be null")
    private String firstName;

    @Column(length = 20)
    @NotNull(message = "last name can not be null")
    private String lastName;

    @NotNull(message = "dob can not be null")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    @Email
    private String email;

    private String isd;

    private Long mobileNumber;

    private String maritalStatus;

    private String bloodGroup;

    private String nationality;

}

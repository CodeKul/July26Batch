package com.codekul.july26batch.registration.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Embeddable
@Setter
@Getter
public class RegistrationDetails {

    @Column(length = 20)
    @NotNull(message = "first name can not be null")
    private String firstName;

    @Column(length = 20)
    @NotNull(message = "last name can not be null")
    private String lastName;

    @NotNull(message = "dob can not be null")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
}

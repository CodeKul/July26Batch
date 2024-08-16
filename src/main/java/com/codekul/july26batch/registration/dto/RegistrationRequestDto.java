package com.codekul.july26batch.registration.dto;

import com.codekul.july26batch.registration.entity.Gender;
import com.codekul.july26batch.registration.entity.Prefix;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class RegistrationRequestDto {

    @NotNull(message = "first name can not be null")
    private String firstName;

    @NotNull(message = "last name can not be null")
    private String lastName;

    @NotNull(message = "dob can not be null")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    @NotNull(message = "prefix can not be null")
    private Prefix prefix;

    @NotNull(message = "gender can not be null")
    private Gender gender;

    @Email
    private String email;

    private String isd;

    private Long mobileNumber;

    private String maritalStatus;

    private String bloodGroup;

    private String nationality;
}

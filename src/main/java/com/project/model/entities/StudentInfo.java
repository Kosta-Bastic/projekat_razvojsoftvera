package com.project.model.entities;

import jakarta.persistence.*;

import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class StudentInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String jmbg;
    private LocalDate dateOfBirth;
    private String placeOfBirth;
    private String placeOfResidence;
    private String countryOfBirth;
    private String citizenshipStatus;
    private String nationality;
    private Character gender;
    private String address;
    private String phoneNumber;
    private String homePhoneNumber;
    private String email;
    private String IDCardNumber;
    private String IDCardProvider;
    private String placeOfLiving;
    private String addressOfLiving;
    private String highSchool;
}
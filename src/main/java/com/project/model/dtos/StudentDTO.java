package com.project.model.dtos;

import com.project.model.entities.StudentInfo;
import lombok.*;

import java.time.LocalDate;

@Data@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class StudentDTO {
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
    private String placeOfLiving;
    private String addressOfLiving;
    private String highSchool;
}

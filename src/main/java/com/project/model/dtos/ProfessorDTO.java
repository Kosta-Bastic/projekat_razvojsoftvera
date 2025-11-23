package com.project.model.dtos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data@Getter@Setter@AllArgsConstructor
public class TeacherDTO {

    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String title;
    private String phoneNumber;
    private boolean admin;
}
package com.project.model.dtos;
import lombok.*;

@Data@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class ProfessorDTO {

    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String middleName;
    private String phoneNumber;

    //private String title;
    //private boolean admin;
}
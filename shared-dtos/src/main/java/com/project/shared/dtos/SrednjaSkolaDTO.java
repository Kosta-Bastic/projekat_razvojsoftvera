package com.project.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SrednjaSkolaDTO {
    private Long id;
    private String naziv;
    private String mesto;
    private String vrstaSkole;
}
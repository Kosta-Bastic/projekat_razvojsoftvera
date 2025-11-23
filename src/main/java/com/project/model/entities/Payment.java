package com.project.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate paymentDate;
    private Double amountEUR;
    private Double amountRSD;
    private Double exchangeRate;

    @ManyToOne
    private StudentIndex studentIndex;
}
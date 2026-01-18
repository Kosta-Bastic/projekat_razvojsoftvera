package com.project.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data@Getter@Setter@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate paymentDate;
    private Double amountRSD;
    private Double exchangeRate;

    @ManyToOne
    private StudentIndex studentIndex;

    public Payment(LocalDate paymentDate,Double amountRSD,Double exchangeRate,StudentIndex studentIndex) {
        this.paymentDate = paymentDate;
        this.amountRSD = amountRSD;
        this.exchangeRate = exchangeRate;
        this.studentIndex = studentIndex;
    }
}
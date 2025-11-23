package com.project.model.dtos;

import com.project.model.entities.StudentIndex;
import lombok.*;

import java.time.LocalDate;

@Data@Getter@Setter@NoArgsConstructor@AllArgsConstructor
public class PaymentDTO {
    private Long id;
    private LocalDate paymentDate;
    private Double amountRSD;
    private Double exchangeRate;
    private StudentIndex studentIndexId;
}
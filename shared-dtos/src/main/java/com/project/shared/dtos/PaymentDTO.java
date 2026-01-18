package com.project.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private Long id;
    private Double amountRSD;
    private Date paymentDate;
    private Double exchangeRate;
    private Long studentIndexId;
}
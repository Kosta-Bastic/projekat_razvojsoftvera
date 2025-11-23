package com.project.mapper;

import com.project.model.dtos.PaymentDTO;
import com.project.model.entities.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {
    public PaymentDTO toPaymentDTO(Payment payment) {
        if (payment == null) return null;

        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setId(payment.getId());
        paymentDTO.setAmountRSD(payment.getAmountRSD());
        paymentDTO.setPaymentDate(payment.getPaymentDate());
        paymentDTO.setExchangeRate(payment.getExchangeRate());
        paymentDTO.setStudentIndexId(payment.getStudentIndex() != null ? payment.getStudentIndex() : null);

        return paymentDTO;
    }
    public Payment toPaymentEntity(PaymentDTO paymentDTO) {
        if (paymentDTO == null) return null;

        Payment payment = new Payment();
        payment.setId(paymentDTO.getId());
        payment.setAmountRSD(paymentDTO.getAmountRSD());
        payment.setPaymentDate(paymentDTO.getPaymentDate());
        payment.setExchangeRate(paymentDTO.getExchangeRate());
        payment.setStudentIndex(paymentDTO.getStudentIndexId() != null ? paymentDTO.getStudentIndexId() : null);

        return payment;
    }
}
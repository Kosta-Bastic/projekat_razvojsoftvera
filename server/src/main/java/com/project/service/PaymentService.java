package com.project.service;

import com.project.mapper.PaymentMapper;
import com.project.model.dtos.PaymentDTO;
import com.project.model.entities.Payment;
import com.project.model.entities.StudentIndex;
import com.project.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentDTO newPayment(Long indexID, double amount,double course) {
        Payment payment = new Payment(java.time.LocalDate.now(),amount,course,new StudentIndex());
        payment.getStudentIndex().setId(indexID);
        paymentRepository.save(payment);
        return PaymentMapper.toDTO(payment);
    }
    public PaymentDTO clearDebt(Long indexID, double course){
        double debt = paymentRepository.getRemaining(indexID) * course;
        if(debt > 0){
            return newPayment(indexID,debt,course);
        }
        return null;
    }
}

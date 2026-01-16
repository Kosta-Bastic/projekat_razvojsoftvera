package com.project.repository;

import com.project.model.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    @Query("select payment from Payment payment where payment.studentIndex=:studentIndex")
    Payment getPayment(int studentIndex);

    @Query("select 3000-(sum(payment.amountRSD/payment.exchangeRate)) from Payment payment where payment.studentIndex.id=:studentIndexID")
    Double getRemaining(Long studentIndexID);
}

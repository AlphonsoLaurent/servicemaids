package com.togoisperfect.servicemaids.repository;

import com.togoisperfect.servicemaids.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByScheduledServiceScheduledId(Long scheduledId);
}
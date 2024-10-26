package com.togoisperfect.servicemaids.service;

import com.togoisperfect.servicemaids.model.Payment;
import com.togoisperfect.servicemaids.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public List<Payment> getPaymentsByScheduledService(Long scheduledId) {
        return paymentRepository.findByScheduledServiceScheduledId(scheduledId);
    }

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}

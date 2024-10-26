package com.togoisperfect.servicemaids.resource;

import com.togoisperfect.servicemaids.model.Payment;
import com.togoisperfect.servicemaids.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/payments")
@AllArgsConstructor
public class PaymentResource {

    private final PaymentService paymentService;

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/scheduled/{scheduledId}")
    public List<Payment> getPaymentsByScheduledService(@PathVariable Long scheduledId) {
        return paymentService.getPaymentsByScheduledService(scheduledId);
    }

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.createPayment(payment);
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Long id) {
        paymentService.deletePayment(id);
    }
}

package com.togoisperfect.servicemaids.service;

import com.togoisperfect.servicemaids.model.AutomatedEmail;
import com.togoisperfect.servicemaids.repository.AutomatedEmailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class AutomatedEmailService {

    private final AutomatedEmailRepository automatedEmailRepository;

    public List<AutomatedEmail> getAllEmails() {
        return automatedEmailRepository.findAll();
    }

    public List<AutomatedEmail> getEmailsByCustomer(Long customerId) {
        return automatedEmailRepository.findByCustomerCustomerId(customerId);
    }

    public AutomatedEmail createEmail(AutomatedEmail email) {
        return automatedEmailRepository.save(email);
    }

    public void deleteEmail(Long id) {
        automatedEmailRepository.deleteById(id);
    }
}

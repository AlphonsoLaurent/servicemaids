package com.servicemaids.resource;
import com.servicemaids.service.AutomatedEmailService;
import com.servicemaids.model.AutomatedEmail;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/emails")
@AllArgsConstructor
public class AutomatedEmailResource {

    private final AutomatedEmailService automatedEmailService;

    @GetMapping
    public List<AutomatedEmail> getAllEmails() {
        return automatedEmailService.getAllEmails();
    }

    @GetMapping("/customer/{customerId}")
    public List<AutomatedEmail> getEmailsByCustomer(@PathVariable Long customerId) {
        return automatedEmailService.getEmailsByCustomer(customerId);
    }

    @PostMapping
    public AutomatedEmail createEmail(@RequestBody AutomatedEmail email) {
        return automatedEmailService.createEmail(email);
    }

    @DeleteMapping("/{id}")
    public void deleteEmail(@PathVariable Long id) {
        automatedEmailService.deleteEmail(id);
    }
}

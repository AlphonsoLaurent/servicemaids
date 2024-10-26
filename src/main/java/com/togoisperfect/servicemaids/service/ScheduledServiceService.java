package com.togoisperfect.servicemaids.service;
import com.togoisperfect.servicemaids.model.ScheduledService;
import com.togoisperfect.servicemaids.repository.ScheduledServiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ScheduledServiceService {

    private final ScheduledServiceRepository scheduledServiceRepository;

    public List<ScheduledService> getAllScheduledServices() {
        return scheduledServiceRepository.findAll();
    }

    public List<ScheduledService> getScheduledServicesByCustomer(Long customerId) {
        return scheduledServiceRepository.findByCustomerCustomerId(customerId);
    }

    public ScheduledService createScheduledService(ScheduledService scheduledService) {
        return scheduledServiceRepository.save(scheduledService);
    }

    public void deleteScheduledService(Long id) {
        scheduledServiceRepository.deleteById(id);
    }
}

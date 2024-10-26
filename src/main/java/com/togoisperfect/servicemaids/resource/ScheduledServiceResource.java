package com.togoisperfect.servicemaids.resource;
import com.togoisperfect.servicemaids.model.ScheduledService;
import com.togoisperfect.servicemaids.service.ScheduledServiceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/scheduled-services")
@AllArgsConstructor
public class ScheduledServiceResource {

    private final ScheduledServiceService scheduledServiceService;

    @GetMapping
    public List<ScheduledService> getAllScheduledServices() {
        return scheduledServiceService.getAllScheduledServices();
    }

    @GetMapping("/customer/{customerId}")
    public List<ScheduledService> getScheduledServicesByCustomer(@PathVariable Long customerId) {
        return scheduledServiceService.getScheduledServicesByCustomer(customerId);
    }

    @PostMapping
    public ScheduledService createScheduledService(@RequestBody ScheduledService service) {
        return scheduledServiceService.createScheduledService(service);
    }

    @DeleteMapping("/{id}")
    public void deleteScheduledService(@PathVariable Long id) {
        scheduledServiceService.deleteScheduledService(id);
    }
}


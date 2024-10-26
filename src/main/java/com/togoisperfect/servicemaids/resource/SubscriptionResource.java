package com.togoisperfect.servicemaids.resource;
import com.togoisperfect.servicemaids.model.Subscription;
import com.togoisperfect.servicemaids.service.SubscriptionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/subscriptions")
@AllArgsConstructor
public class SubscriptionResource {

    private final SubscriptionService subscriptionService;

    @GetMapping
    public List<Subscription> getAllSubscriptions() {
        return subscriptionService.getAllSubscriptions();
    }

    @GetMapping("/customer/{customerId}")
    public List<Subscription> getSubscriptionsByCustomer(@PathVariable Long customerId) {
        return subscriptionService.getSubscriptionsByCustomer(customerId);
    }

    @PostMapping
    public Subscription createSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.createSubscription(subscription);
    }

    @DeleteMapping("/{id}")
    public void deleteSubscription(@PathVariable Long id) {
        subscriptionService.deleteSubscription(id);
    }
}

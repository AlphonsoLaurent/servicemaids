package com.togoisperfect.servicemaids.resource;

import com.togoisperfect.servicemaids.model.ServiceAddress;
import com.togoisperfect.servicemaids.service.ServiceAddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/addresses")
@AllArgsConstructor
public class ServiceAddressResource {

    private final ServiceAddressService serviceAddressService;

    @GetMapping
    public List<ServiceAddress> getAllAddresses() {
        return serviceAddressService.getAllAddresses();
    }

    @GetMapping("/customer/{customerId}")
    public List<ServiceAddress> getAddressesByCustomer(@PathVariable Long customerId) {
        return serviceAddressService.getAddressesByCustomer(customerId);
    }

    @PostMapping
    public ServiceAddress createAddress(@RequestBody ServiceAddress address) {
        return serviceAddressService.createAddress(address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id) {
        serviceAddressService.deleteAddress(id);
    }
}


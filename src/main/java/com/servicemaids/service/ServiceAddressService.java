package com.servicemaids.service;
import com.servicemaids.model.ServiceAddress;
import com.servicemaids.repository.ServiceAddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ServiceAddressService {

    private final ServiceAddressRepository serviceAddressRepository;

    public List<ServiceAddress> getAllAddresses() {
        return serviceAddressRepository.findAll();
    }

    public List<ServiceAddress> getAddressesByCustomer(Long customerId) {
        return serviceAddressRepository.findByCustomerCustomerId(customerId);
    }

    public ServiceAddress createAddress(ServiceAddress address) {
        return serviceAddressRepository.save(address);
    }

    public void deleteAddress(Long id) {
        serviceAddressRepository.deleteById(id);
    }
}

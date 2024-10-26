package com.servicemaids.repository;

import com.servicemaids.model.ServiceAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ServiceAddressRepository extends JpaRepository<ServiceAddress, Long> {
    List<ServiceAddress> findByCustomerCustomerId(Long customerId);
}


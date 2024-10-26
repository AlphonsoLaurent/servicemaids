package com.togoisperfect.servicemaids.repository;
import com.togoisperfect.servicemaids.model.ScheduledService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ScheduledServiceRepository extends JpaRepository<ScheduledService, Long> {
    List<ScheduledService> findByCustomerCustomerId(Long customerId);
}

package com.togoisperfect.servicemaids.repository;
import com.togoisperfect.servicemaids.model.AutomatedEmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AutomatedEmailRepository extends JpaRepository<AutomatedEmail, Long> {
    List<AutomatedEmail> findByCustomerCustomerId(Long customerId);
}

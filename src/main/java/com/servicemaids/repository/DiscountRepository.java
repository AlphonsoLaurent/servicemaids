package com.servicemaids.repository;
import com.servicemaids.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {
    Optional<Discount> findByCode(String code);
}

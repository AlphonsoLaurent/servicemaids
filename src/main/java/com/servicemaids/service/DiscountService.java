package com.servicemaids.service;

import com.servicemaids.repository.DiscountRepository;
import com.servicemaids.model.Discount;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DiscountService {

    private final DiscountRepository discountRepository;

    public List<Discount> getAllDiscounts() {
        return discountRepository.findAll();
    }

    public Optional<Discount> getDiscountByCode(String code) {
        return discountRepository.findByCode(code);
    }

    public Discount createDiscount(Discount discount) {
        return discountRepository.save(discount);
    }

    public void deleteDiscount(Long id) {
        discountRepository.deleteById(id);
    }
}


package com.servicemaids.resource;
import com.servicemaids.model.Discount;
import com.servicemaids.service.DiscountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/discounts")
@AllArgsConstructor
public class DiscountResource {

    private final DiscountService discountService;

    @GetMapping
    public List<Discount> getAllDiscounts() {
        return discountService.getAllDiscounts();
    }

    @GetMapping("/code/{code}")
    public Optional<Discount> getDiscountByCode(@PathVariable String code) {
        return discountService.getDiscountByCode(code);
    }

    @PostMapping
    public Discount createDiscount(@RequestBody Discount discount) {
        return discountService.createDiscount(discount);
    }

    @DeleteMapping("/{id}")
    public void deleteDiscount(@PathVariable Long id) {
        discountService.deleteDiscount(id);
    }
}

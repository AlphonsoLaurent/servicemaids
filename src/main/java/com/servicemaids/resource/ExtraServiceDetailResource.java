package com.servicemaids.resource;
import com.servicemaids.model.ExtraServiceDetail;
import com.servicemaids.service.ExtraServiceDetailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/extra-service-details")
@AllArgsConstructor
public class ExtraServiceDetailResource {

    private final ExtraServiceDetailService extraServiceDetailService;

    @GetMapping
    public List<ExtraServiceDetail> getAllDetails() {
        return extraServiceDetailService.getAllDetails();
    }

    @PostMapping
    public ExtraServiceDetail createDetail(@RequestBody ExtraServiceDetail detail) {
        return extraServiceDetailService.createDetail(detail);
    }

    @DeleteMapping("/{id}")
    public void deleteDetail(@PathVariable Long id) {
        extraServiceDetailService.deleteDetail(id);
    }
}

package com.togoisperfect.servicemaids.resource;

import com.togoisperfect.servicemaids.model.ServiceCatalog;
import com.togoisperfect.servicemaids.service.ServiceCatalogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/services")
@AllArgsConstructor
public class ServiceCatalogResource {

    private final ServiceCatalogService serviceCatalogService;

    @GetMapping
    public List<ServiceCatalog> getAllServices() {
        return serviceCatalogService.getAllServices();
    }

    @PostMapping
    public ServiceCatalog createService(@RequestBody ServiceCatalog service) {
        return serviceCatalogService.createService(service);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable Long id) {
        serviceCatalogService.deleteService(id);
    }
}


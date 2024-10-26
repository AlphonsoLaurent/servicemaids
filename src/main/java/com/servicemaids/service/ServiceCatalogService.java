package com.servicemaids.service;
import com.servicemaids.model.ServiceCatalog;
import com.servicemaids.repository.ServiceCatalogRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ServiceCatalogService {

    private final ServiceCatalogRepository serviceCatalogRepository;

    public List<ServiceCatalog> getAllServices() {
        return serviceCatalogRepository.findAll();
    }

    public ServiceCatalog createService(ServiceCatalog service) {
        return serviceCatalogRepository.save(service);
    }

    public void deleteService(Long id) {
        serviceCatalogRepository.deleteById(id);
    }
}

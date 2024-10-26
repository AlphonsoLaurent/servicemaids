package com.servicemaids.service;

import com.servicemaids.model.ExtraServiceCatalog;
import com.servicemaids.repository.ExtraServiceCatalogRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ExtraServiceCatalogService {

    private final ExtraServiceCatalogRepository extraServiceCatalogRepository;

    public List<ExtraServiceCatalog> getAllExtras() {
        return extraServiceCatalogRepository.findAll();
    }

    public ExtraServiceCatalog createExtra(ExtraServiceCatalog extra) {
        return extraServiceCatalogRepository.save(extra);
    }

    public void deleteExtra(Long id) {
        extraServiceCatalogRepository.deleteById(id);
    }
}


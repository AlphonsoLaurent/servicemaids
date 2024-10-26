package com.togoisperfect.servicemaids.repository;

import com.togoisperfect.servicemaids.model.ServiceCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceCatalogRepository extends JpaRepository<ServiceCatalog, Long> {
}


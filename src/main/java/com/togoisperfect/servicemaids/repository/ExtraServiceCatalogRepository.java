package com.togoisperfect.servicemaids.repository;

import com.togoisperfect.servicemaids.model.ExtraServiceCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraServiceCatalogRepository extends JpaRepository<ExtraServiceCatalog, Long> {
}

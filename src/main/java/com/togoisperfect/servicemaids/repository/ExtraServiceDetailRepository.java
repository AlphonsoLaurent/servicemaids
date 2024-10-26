package com.togoisperfect.servicemaids.repository;
import com.togoisperfect.servicemaids.model.ExtraServiceDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraServiceDetailRepository extends JpaRepository<ExtraServiceDetail, Long> {
}

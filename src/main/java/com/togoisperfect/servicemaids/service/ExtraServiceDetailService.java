package com.togoisperfect.servicemaids.service;
import com.togoisperfect.servicemaids.model.ExtraServiceDetail;
import com.togoisperfect.servicemaids.repository.ExtraServiceDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ExtraServiceDetailService {

    private final ExtraServiceDetailRepository extraServiceDetailRepository;

    public List<ExtraServiceDetail> getAllDetails() {
        return extraServiceDetailRepository.findAll();
    }

    public ExtraServiceDetail createDetail(ExtraServiceDetail detail) {
        return extraServiceDetailRepository.save(detail);
    }

    public void deleteDetail(Long id) {
        extraServiceDetailRepository.deleteById(id);
    }
}


package com.servicemaids.service;
import com.servicemaids.repository.ExtraServiceDetailRepository;
import com.servicemaids.model.ExtraServiceDetail;
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


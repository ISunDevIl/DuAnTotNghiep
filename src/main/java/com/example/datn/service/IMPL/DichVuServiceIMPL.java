package com.example.datn.service.IMPL;

import com.example.datn.model.CloundinaryReponse;
import com.example.datn.model.DichVu;
import com.example.datn.repository.DichVuRepository;
import com.example.datn.service.DichVuService;
import com.example.datn.util.FileUploadUtil;
import jakarta.persistence.EntityNotFoundException;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.*;
import java.util.List;

@Service
public class DichVuServiceIMPL implements DichVuService {
    @Autowired
    DichVuRepository dichVuRepository;
    @Autowired
    CloundinaryService cloundinaryService;

    @Override
    public List<DichVu> getAll() {
        return dichVuRepository.findAll();
    }

    @Override
    public void addDichVu(DichVu dv) {
        dichVuRepository.save(dv);
    }

    @Override
    public DichVu detailDichVu(Integer id) {
        return dichVuRepository.getReferenceById(id);
    }

    @Override
    public void updateStatus(Integer id) {
        dichVuRepository.getById(id).setTrangThai("Ngừng hoạt động");
    }

    @Override
    public void updateDichVu(DichVu dv) {
        dichVuRepository.save(dv);
    }

    @Override
    public List<DichVu> findByAll(String key) {
        return dichVuRepository.findByTenDichVu(key);
    }

    @Transactional
    public void uploadImage(final Integer id, final MultipartFile file) throws EntityNotFoundException {
        final DichVu dichVu = dichVuRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Dich vu not found"));

        // Thực hiện upload ảnh
        FileUploadUtil.assertAllowed(file, FileUploadUtil.IMAGE_PATTERN);
        final String fileName = FileUploadUtil.getFileName(file.getOriginalFilename());
        final CloundinaryReponse reponse = this.cloundinaryService.uploadFile(file, fileName);
        dichVu.setHinhAnh(reponse.getUrl());
        this.dichVuRepository.save(dichVu);
    }
}

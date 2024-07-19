package com.example.datn.service;

import com.example.datn.model.Phong;
import com.example.datn.repository.PhongRepo;

import java.util.List;

public interface PhongService {
    List<Phong> findAll();
    void addPhong(Phong phong);
    Phong detailPhong(Integer id);
    void updatePhong(Phong phong);
    void updateStatusPhong(Integer id);
}

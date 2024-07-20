package com.example.datn.service.IMPL;

import com.example.datn.model.Phong;
import com.example.datn.repository.PhongRepo;
import com.example.datn.service.PhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongServiceIMPL implements PhongService {
    @Autowired
    PhongRepo phongRepo;
    @Override
    public List<Phong> getAll() {
        return phongRepo.findAll();
    }

    @Override
    public void add(Phong phong) {
        phongRepo.save(phong);
    }

    @Override
    public Phong detail(Integer id) {
        return phongRepo.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        phongRepo.deleteById(id);
    }

    @Override
    public void update(Phong phong) {
        phongRepo.save(phong);
    }
}

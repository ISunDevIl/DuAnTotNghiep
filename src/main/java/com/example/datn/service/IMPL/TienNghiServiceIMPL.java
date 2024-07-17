package com.example.datn.service.IMPL;

import com.example.datn.model.DichVu;
import com.example.datn.model.TienNghi;
import com.example.datn.repository.TienNghiRepository;
import com.example.datn.service.TienNghiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TienNghiServiceIMPL implements TienNghiService {
    @Autowired
    TienNghiRepository tienNghiRepository;

    @Override
    public List<TienNghi> getAll() {
        return tienNghiRepository.findAll();
    }

    @Override
    public void add(TienNghi tienNghi) {
        tienNghiRepository.save(tienNghi);
    }

    @Override
    public TienNghi detail(Integer id) {
        return tienNghiRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        tienNghiRepository.deleteById(id);
    }

    @Override
    public void update(TienNghi tienNghi) {
        tienNghiRepository.save(tienNghi);
    }
}

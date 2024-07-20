package com.example.datn.service;

import com.example.datn.model.DichVu;
import com.example.datn.model.TienNghi;

import java.util.List;

public interface TienNghiService {
    List<TienNghi> getAll();

    public void add(TienNghi tienNghi);

    public TienNghi detail(Integer id);

    public void delete(Integer id);

    public void update(TienNghi tienNghi);
}

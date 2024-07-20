package com.example.datn.service;

import com.example.datn.model.Phong;

import java.util.List;

public interface PhongService {
    List<Phong> getAll();

    public void add(Phong phong);

    public Phong detail(Integer id);

    public void delete(Integer id);

    public void update(Phong phong);
}

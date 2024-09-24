package com.example.datn.repository;

import com.example.datn.model.DatPhong;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DatPhongRepository extends JpaRepository<DatPhong, Integer>{
    List<DatPhong> getPhieuDatPhongByMaDatPhong(String ma);
}

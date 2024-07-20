package com.example.datn.repository;

import com.example.datn.model.PhieuDatPhong;
import com.example.datn.model.PhieuDichVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PhieuDatPhongRepository extends JpaRepository<PhieuDatPhong, Integer>{
    List<PhieuDatPhong> getPhieuDatPhongByMaDatPhong(String ma);
}

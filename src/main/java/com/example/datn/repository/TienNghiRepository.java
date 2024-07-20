package com.example.datn.repository;

import com.example.datn.model.DichVu;
import com.example.datn.model.TienNghi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TienNghiRepository extends JpaRepository<TienNghi,Integer> {
}

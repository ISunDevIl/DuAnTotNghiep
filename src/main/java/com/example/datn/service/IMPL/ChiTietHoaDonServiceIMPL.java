package com.example.datn.service.IMPL;

import com.example.datn.model.ThongTinDatPhong;
import com.example.datn.repository.ChiTietHoaDonRepo;
import com.example.datn.service.ChiTietHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChiTietHoaDonServiceIMPL implements ChiTietHoaDonService {
    @Autowired
    ChiTietHoaDonRepo chiTietHoaDonRepo;

    @Override
    public List<ThongTinDatPhong> findAll() {
        return chiTietHoaDonRepo.findAll();
    }

    @Override
    public void add(ThongTinDatPhong thongTinDatPhong) {
        chiTietHoaDonRepo.save(thongTinDatPhong);
    }

    @Override
    public ThongTinDatPhong detail(Integer id) {
        return chiTietHoaDonRepo.findById(id).get();
    }

    @Override
    public void update(ThongTinDatPhong thongTinDatPhong) {
        chiTietHoaDonRepo.save(thongTinDatPhong);
    }

    @Override
    public ThongTinDatPhong delete(Integer id) {
        Optional<ThongTinDatPhong> chiTietHoaDon = chiTietHoaDonRepo.findById(id);
        if (chiTietHoaDon.isPresent()){
            chiTietHoaDonRepo.delete(chiTietHoaDon.get());
            return chiTietHoaDon.get();
        }
        return null;
    }
}

package com.example.datn.controller;

import com.example.datn.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NhanVienController {
    @Autowired
    NhanVienRepository nhanVienRepository;

    @GetMapping("nhan-vien")
    public String hienThi(Model model){
        model.addAttribute("list" ,nhanVienRepository.findAll());
        return "nhan_vien/index";
    }
}

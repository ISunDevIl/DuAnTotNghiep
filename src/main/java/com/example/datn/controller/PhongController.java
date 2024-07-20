package com.example.datn.controller;

import com.example.datn.model.Phong;
import com.example.datn.model.TienNghi;
import com.example.datn.service.PhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/phong")
public class PhongController {
    @Autowired
    PhongService phongService;

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("list",phongService.getAll());
        return "Phong/home";
    }

    @PostMapping("/add")
    public String add(Phong phong){
//        String filePath = "/uploads/" + hinhAnh.getOriginalFilename();
//        File file = new File(filePath);
//        hinhAnh.transferTo(file);
//        phong.setHinhAnh(String.valueOf(hinhAnh));
        phongService.add(phong);
        return "redirect:/phong/home";
    }

//    @GetMapping("/detail")
//    public String detail(@RequestParam("id") int id, Model model){
//        model.addAttribute("listTienNghi",phongService.getAll());
//        model.addAttribute("TienNghi",phongService.detail(id));
//        return "TienNghi/home";
//    }
    @GetMapping("/delete")
    public String dedlete(@RequestParam("id") int id){
        phongService.delete(id);
        return "redirect:/phong/home";
    }

    @PostMapping("/update")
    public String update(Phong phong){
        phongService.update(phong);
        return "redirect:/phong/home";
    }

    @ModelAttribute("listTinhTrang")
    public List<String> tinhTrang(Model model){
        List<String> list = Arrays.asList("Trống", "Đã đặt phòng", "Có khách");
        return list;
    }
}

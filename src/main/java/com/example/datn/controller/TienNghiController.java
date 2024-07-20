package com.example.datn.controller;

import com.example.datn.model.TienNghi;
import com.example.datn.service.IMPL.TienNghiServiceIMPL;
import com.example.datn.service.TienNghiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/tien-nghi")
public class TienNghiController {
    @Autowired
    TienNghiService tienNghiService;
//    @Autowired
//    TienNghiServiceIMPL tienNghiServiceIMPL;
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("listTienNghi",tienNghiService.getAll());
        return "TienNghi/home";
    }

    @PostMapping("/add")
    public String add(TienNghi tienNghi){
        tienNghiService.add(tienNghi);
        return "redirect:/tien-nghi/home";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam("id") int id,Model model){
        model.addAttribute("listTienNghi",tienNghiService.getAll());
        model.addAttribute("TienNghi",tienNghiService.detail(id));
        return "TienNghi/home";
    }
    @GetMapping("/delete")
    public String dedlete(@RequestParam("id") int id){
        tienNghiService.delete(id);
        return "redirect:/tien-nghi/home";
    }

    @PostMapping("/update")
    public String update(TienNghi tienNghi){
        tienNghiService.update(tienNghi);
        return "redirect:/tien-nghi/home";
    }
    @GetMapping("/update-status")
    public String update(@RequestParam("id") int id){
        TienNghi tn1 = tienNghiService.detail(id);
        tn1.setTrangThai("Ngừng hoạt động");
        tienNghiService.update(tn1);
        return "redirect:/tien-nghi/home";
    }
}

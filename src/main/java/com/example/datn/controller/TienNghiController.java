package com.example.datn.controller;

import com.example.datn.model.TienIch;
import com.example.datn.service.IMPL.TienNghiServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/tien-nghi")
public class TienNghiController {

    @Autowired
    TienNghiServiceIMPL tienNghiServiceIMPL;
    @GetMapping("/home")
    public List<TienIch> home(){
        return tienNghiServiceIMPL.getAll();
    }

    @PostMapping("/add")
    public String add(TienIch tienIch){
        tienNghiServiceIMPL.add(tienIch);
        return "redirect:/tien-nghi/home";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam("id") int id,Model model){
        model.addAttribute("listTienNghi",tienNghiServiceIMPL.getAll());
        model.addAttribute("TienNghi",tienNghiServiceIMPL.detail(id));
        return "TienNghi/home";
    }
    @GetMapping("/delete")
    public String dedlete(@RequestParam("id") int id){
        tienNghiServiceIMPL.delete(id);
        return "redirect:/tien-nghi/home";
    }

    @PostMapping("/update")
    public String update(TienIch tienIch){
        tienNghiServiceIMPL.update(tienIch);
        return "redirect:/tien-nghi/home";
    }
    @GetMapping("/update-status")
    public String update(@RequestParam("id") int id){
        TienIch tn1 = tienNghiServiceIMPL.detail(id);
        tn1.setTrangThai("Ngừng hoạt động");
        tienNghiServiceIMPL.update(tn1);
        return "redirect:/tien-nghi/home";
    }
}

package com.example.datn.controller;

import com.example.datn.model.DichVu;
import com.example.datn.service.IMPL.DichVuServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/dich_vu")
public class DichVuController {

    @Autowired
    DichVuServiceIMPL dichVuServiceIMPL;

    @GetMapping("/home/{id}")
    public String home(Model model) {
        model.addAttribute("list", dichVuServiceIMPL.getAll());
        return "/DichVu/home";
    }
    @GetMapping("/home")
    public List<DichVu> home(){
        return dichVuServiceIMPL.getAll();
    }

    @PostMapping("/image/{id}")
    public ResponseEntity<?> uploadImages(@PathVariable final Integer id, @RequestParam("file") final MultipartFile file){
        this.dichVuServiceIMPL.uploadImage(id, file);
        return ResponseEntity.ok("Upload file successfully");
    }
}

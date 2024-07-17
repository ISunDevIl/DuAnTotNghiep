package com.example.datn.controller;

import com.example.datn.repository.DichVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DichVuController {

    @Autowired
    DichVuRepository dichVuRepository;
}

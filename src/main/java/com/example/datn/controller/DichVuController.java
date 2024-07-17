package com.example.datn.controller;

import com.example.datn.service.IMPL.DichVuServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DichVuController {

    @Autowired
    DichVuServiceIMPL dichVuServiceIMPL;



}

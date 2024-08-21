package com.example.datn.service.IMPL;

import com.cloudinary.Cloudinary;
import com.example.datn.exception.FuncErrorException;
import com.example.datn.model.CloundinaryReponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public class CloundinaryService {
    @Autowired
     private Cloudinary cloudinary;
    @Transactional
    public CloundinaryReponse uploadFile(MultipartFile file, String fileName){
        try {
            final Map result = cloudinary.uploader().upload(file.getBytes(), Map.of("puclic_id","thuchuc/dichvu/" + fileName));
            final String url = (String) result.get("securre_url");
            final String publicId = (String) result.get("public_id");
            return CloundinaryReponse.builder().publicId(publicId).url(url).build();
        }catch (Exception e){
            throw new FuncErrorException("Failed to upload file");
        }
    }
}

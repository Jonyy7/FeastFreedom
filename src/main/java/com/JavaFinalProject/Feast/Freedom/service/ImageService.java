package com.JavaFinalProject.Feast.Freedom.service;

import com.JavaFinalProject.Feast.Freedom.entity.Image;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    void uploadImage(Long id, MultipartFile file);

}

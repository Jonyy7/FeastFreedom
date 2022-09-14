package com.JavaFinalProject.Feast.Freedom.service;

import com.JavaFinalProject.Feast.Freedom.entity.Kitchen;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface KitchenService {

    void saveKitchenWithMenu(Kitchen kitchen);

    List<Kitchen> findAllKitchen();

    Kitchen findKitchenById(Long id);

    void updateKitchenNameandEmailById(String name, String email, Long id);

    void deleteKitchen(Long id);

}

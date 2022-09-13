package com.JavaFinalProject.Feast.Freedom.repository;

import com.JavaFinalProject.Feast.Freedom.entity.Image;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ImageRepositoryTest {

    @Autowired
    private ImageRepository imageRepo;

//    @Test
//    public void findImageByKitchenId(){
//
//        Image image = imageRepo.findByKitchenId(2l);
//
//        System.out.println("Image " + image);
//
//    }

    @Test
    public void getImage(){
        Image image = imageRepo.findById(3l).get();

        System.out.println("Image " + image);
    }
}

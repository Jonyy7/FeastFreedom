package com.JavaFinalProject.Feast.Freedom.repository;

import com.JavaFinalProject.Feast.Freedom.entity.Image;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ImageRepositoryTest {

    @Autowired
    private ImageRepository imageRepo;

//    @Test
//    public void findImageByKitchenId(){
//
//        Image img = imageRepo.findByKitchenId(1l);
//
//        System.out.println("Image ID " + img);
//
//    }

//    @Test
//    public void getImage(){
//        Image image = imageRepo.findById(4l).get();
//
//        System.out.println("Image " + image);
//    }


//    @Test
//    public void getAllImage(){
//        List<Image> imageList = imageRepo.findAll();
//
//        System.out.println("List : " + imageList);
//    }

//    @Test
//    public void findImageByFileName(){
//        Image img = imageRepo.findByFileName("Panda_Express.jpg");
//
//        System.out.println("Image: " + img);
//    }
}

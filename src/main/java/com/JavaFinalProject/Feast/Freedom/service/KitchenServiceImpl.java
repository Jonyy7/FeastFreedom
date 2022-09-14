package com.JavaFinalProject.Feast.Freedom.service;

import com.JavaFinalProject.Feast.Freedom.config.BucketName;
import com.JavaFinalProject.Feast.Freedom.entity.Image;
import com.JavaFinalProject.Feast.Freedom.entity.Kitchen;
import com.JavaFinalProject.Feast.Freedom.entity.Menu;
import com.JavaFinalProject.Feast.Freedom.repository.ImageRepository;
import com.JavaFinalProject.Feast.Freedom.repository.KitchenRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.apache.http.entity.ContentType.*;
import static org.apache.http.entity.ContentType.IMAGE_JPEG;

@AllArgsConstructor
@Service
public class KitchenServiceImpl {

    private final FileStore fileStore;

    @Autowired
    KitchenRepository kitchenRepo;

    @Autowired
    ImageRepository imageRepo;


import com.JavaFinalProject.Feast.Freedom.entity.Kitchen;
import com.JavaFinalProject.Feast.Freedom.entity.Menu;
import com.JavaFinalProject.Feast.Freedom.repository.ImageRepository;
import com.JavaFinalProject.Feast.Freedom.repository.KitchenRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.apache.http.entity.ContentType.*;
import static org.apache.http.entity.ContentType.IMAGE_JPEG;

@AllArgsConstructor
@Service
public class KitchenServiceImpl {

    private final FileStore fileStore;

    @Autowired
    KitchenRepository kitchenRepo;

    public void saveKitchenWithMenu(Kitchen kitchen) {

//        Menu menu1 = Menu.builder()
//                .menuName("Beef Noodle")
//                .vegetarian("no")
//                .menuPrice(13.25)
//                .build();
//
//        Menu menu2 = Menu.builder()
//                .menuName("Prawn Noodle")
//                .vegetarian("no")
//                .menuPrice(13.25)
//                .build();

//        DateFormat sdf = new SimpleDateFormat("hh:mm aa");
//
//        String startTimeStr = "11:30 am";
//        String endTimeStr = "6:30 pm";
//
//        Date startTime = sdf.parse(startTimeStr);
//        Date endTime = sdf.parse(endTimeStr);

//        Kitchen kitchen1 = Kitchen.builder()
//                .kitchenName("Hell's Kitchen II")
//                .kitchenEmail("hellskitchenII@gmail.com")
//                .kitchenPassword("password")
//                .kitchenImage("img_4")
//                .workDays("0111110")
//                .workStartTime(startTime)
//                .workEndTime(endTime)
//                .menus(Arrays.asList(menu1, menu2))
//                .build();

        kitchenRepo.save(kitchen);

    }

    public List<Kitchen> findAllKitchen(){
        return kitchenRepo.findAll();
    }

    public Kitchen findKitchenById(Long id){
        return kitchenRepo.findById(id).get();
    }

    public void updateKitchenNameandEmailById(String name, String email, Long id){
        kitchenRepo.updateKitchenNameAndEmailById(name, email, id);
    }

    public void deleteKitchen(Long id){
        kitchenRepo.deleteById(id);
    }

//    public void uploadImage(Long id, MultipartFile file){
//        // check if file is empty;
//        if (file.isEmpty()) {
//            throw new IllegalStateException("Cannot upload empty file");
//        }
//
//        //Check if the file is an image
//        if (!Arrays.asList(IMAGE_PNG.getMimeType(),
//                IMAGE_BMP.getMimeType(),
//                IMAGE_GIF.getMimeType(),
//                IMAGE_JPEG.getMimeType()).contains(file.getContentType())) {
//            throw new IllegalStateException("FIle uploaded is not an image");
//        }
//
//        //get file metadata
//        Map<String, String> metadata = new HashMap<>();
//        metadata.put("Content-Type", file.getContentType());
//        metadata.put("Content-Length", String.valueOf(file.getSize()));
//
//        // Save image in s3 and then save todo in the database
//        String path = String.format("%s/%s", BucketName.TODO_IMAGE.getBucketName(), UUID.randomUUID());
//        String fileName = String.format("%s", file.getOriginalFilename());
//
//        try {
//            fileStore.upload(path, fileName, Optional.of(metadata), file.getInputStream());
//        } catch (IOException e){
//            throw new IllegalStateException("Failed to upload file to S3", e);
//        }
//
//        Kitchen kitchen = kitchenRepo.findById(id).get();
//
//        Image image = Image.builder()
//                .imagePath(path)
//                .imageFileName(fileName)
//                .kitchen(kitchen)
//                .build();
//
//        imageRepo.save(image);
//
//    }

}

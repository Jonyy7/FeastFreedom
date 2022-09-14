package com.JavaFinalProject.Feast.Freedom.controller;

<<<<<<< Updated upstream
=======

import com.JavaFinalProject.Feast.Freedom.entity.Image;
>>>>>>> Stashed changes
import com.JavaFinalProject.Feast.Freedom.entity.Kitchen;
import com.JavaFinalProject.Feast.Freedom.service.ImageServiceImpl;
import com.JavaFinalProject.Feast.Freedom.service.KitchenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class KitchenController {

    @Autowired
    private KitchenServiceImpl kitchenService;

    @Autowired
    private ImageServiceImpl imageService;


    @GetMapping("/get-kitchens")
    public List<Kitchen> getAllKitchen(){
        return kitchenService.findAllKitchen();
    }

    @GetMapping("/get-kitchen/{id}")
    public ResponseEntity<Kitchen> getKitchen(@PathVariable long id) {
        Kitchen kitchen = kitchenService.findKitchenById(id);
        return new ResponseEntity<Kitchen>(kitchen, HttpStatus.OK);
    }

    @PostMapping("/add-kitchen")
    public void addKitchen(@RequestBody Kitchen kitchen) {
        kitchenService.saveKitchenWithMenu(kitchen);
    }

    /**
     * API to update kitchen with all information and create new entry
     */
    @PutMapping("/update-kitchen/{id}")
    public ResponseEntity<Kitchen> updateKitchen(@RequestBody Kitchen kitchenDetails, @PathVariable long id){
        try{
            Kitchen existKitchen = kitchenService.findKitchenById(id);

            kitchenDetails.setKitchenId(id);
            kitchenService.saveKitchenWithMenu(kitchenDetails);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete-kitchen/{id}")
    public void deleteKitchen(@PathVariable long id){
        kitchenService.deleteKitchen(id);
    }

    @PostMapping(
            path = "/upload-image/{id}",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void uploadImage(@PathVariable long id,
                                          @RequestParam("file") MultipartFile file) {
        imageService.uploadImage(id, file);
    }


//    @PostMapping(
//            path = "/image/{id}",
//            produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public Image getImageById(@PathVariable long id){
//        return imageService.getImageByKitchenId(id);
//    }


}

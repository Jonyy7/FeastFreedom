package com.JavaFinalProject.Feast.Freedom.controller;

import com.JavaFinalProject.Feast.Freedom.entity.Kitchen;
import com.JavaFinalProject.Feast.Freedom.service.KitchenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class KitchenController {

    @Autowired
    private KitchenServiceImpl kitchenService;


    @GetMapping("/get-kitchen")
    public List<Kitchen> getKitchen(){
        return kitchenService.findAllKitchen();
    }

    @PostMapping("/add-kitchen")
    public void addKitchen(@RequestBody Kitchen kitchen) throws ParseException {
        // TODO: fix error JSON parse error: Cannot deserialize value of type `java.util.Date` from String \"15:00:00\"
        kitchenService.saveKitchenWithMenu(kitchen);
    }

    @DeleteMapping


}

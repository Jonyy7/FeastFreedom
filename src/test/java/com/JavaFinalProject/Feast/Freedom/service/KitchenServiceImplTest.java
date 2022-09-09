package com.JavaFinalProject.Feast.Freedom.service;

import com.JavaFinalProject.Feast.Freedom.entity.Kitchen;
import com.JavaFinalProject.Feast.Freedom.repository.KitchenRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KitchenServiceImplTest {

    @Mock
    private KitchenRepository kitchenRepo;

    @InjectMocks
    @Autowired
    private KitchenServiceImpl kitchenService;

    @Test
    public void testServiceSaveKitchenWithMenu() throws ParseException {
        kitchenService.saveKitchenWithMenu();
    }

    @Test
    public List<Kitchen> testServiceFindAllKitchen(){
        return kitchenService.findAllKitchen();
    }

    @Test
    public Kitchen testServiceFindKitchenById(){
        return kitchenService.findKitchenById(1L);
    }

    @Test
    public void testServiceUpdateKitchenNameAndEmailById(){
        kitchenService.updateKitchenNameandEmailById("Marian's Kitchen", "marianskitchen@gmail.com", 1L);
    }

    @Test
    public void testServiceDeleteKitchen(){
        kitchenService.deleteKitchen(3L);
    }







}
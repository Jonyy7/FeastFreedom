package com.JavaFinalProject.Feast.Freedom.service;

import com.JavaFinalProject.Feast.Freedom.entity.Kitchen;
import com.JavaFinalProject.Feast.Freedom.repository.ImageRepository;
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


//    @Test
//    public void testServiceSaveKitchenWithMenu() throws ParseException {
//        kitchenService.saveKitchenWithMenu();
//    }

    /**
     * error: No tests were found
     * possible reason: doesn't consider it to be a test method unless the return type is
     * void
     */
//    @Test
//    public List<Kitchen> testServiceFindAllKitchen(){
//        return kitchenService.findAllKitchen();
//    }


    @Test
    public void testServiceFindAllKitchen(){
        List<Kitchen> kitchens  = kitchenService.findAllKitchen();

        System.out.println("kitchens = " + kitchens);
    }

    /**
     * error: No tests were found
     * possible reason: doesn't consider it to be a test method unless the return type is
     * void
     */
//    @Test
//    public Kitchen testServiceFindKitchenById(){
//        return kitchenService.findKitchenById(2L);
//    }

    @Test
    public void testServiceFindKitchenById(){
        Kitchen kitchen = kitchenService.findKitchenById(2L);
        System.out.println("kitchen = " + kitchen);
    }


    @Test
    public void testServiceUpdateKitchenNameAndEmailById(){
        kitchenService.updateKitchenNameandEmailById("PandaExpressss", "PandaExpressss@gmail.com", 8L);
    }

    @Test
    public void testServiceDeleteKitchen(){
        kitchenService.deleteKitchen(4L);
    }

}
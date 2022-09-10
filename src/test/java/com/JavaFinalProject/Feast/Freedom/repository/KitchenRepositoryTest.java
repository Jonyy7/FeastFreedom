package com.JavaFinalProject.Feast.Freedom.repository;

import com.JavaFinalProject.Feast.Freedom.entity.Kitchen;
import com.JavaFinalProject.Feast.Freedom.entity.Menu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KitchenRepositoryTest {

    @Autowired
    private KitchenRepository kitchenRepo;

    @Test
    public void saveKitchenWithMenu() {

        Menu menu1 = Menu.builder()
                .menuName("Beef Noodle")
                .vegetarian("no")
                .menuPrice(13.25)
                .build();

        Menu menu2 = Menu.builder()
                .menuName("Prawn Noodle")
                .vegetarian("no")
                .menuPrice(13.25)
                .build();

//        DateFormat sdf = new SimpleDateFormat("hh:mm aa");

//        String startTimeStr = "08:15 am";
//        String endTimeStr = "4:30 pm";
//
//        Date startTime = sdf.parse(startTimeStr);
//        Date endTime = sdf.parse(endTimeStr);

        Kitchen kitchen1 = Kitchen.builder()
                .kitchenName("Panda Express")
                .kitchenEmail("pandaexpress@gmail.com")
                .kitchenPassword("password")
                .kitchenImage("img_1")
                .workDays("1111100")
                .workStartTime("08:15 am")
                .workEndTime("4:30 pm")
                .menus(Arrays.asList(menu1, menu2))
                .build();

//        String startTimeStr = "09:30 am";
//        String endTimeStr = "5:30 pm";
//
//        Date startTime = sdf.parse(startTimeStr);
//        Date endTime = sdf.parse(endTimeStr);
//
//        Kitchen kitchen2 = Kitchen.builder()
//                .name("Hell's Kitchen")
//                .email("hellskitchen@gmail.com")
//                .password("password")
//                .image("img_2")
//                .workDays("0111110")
//                .workStartTime(startTime)
//                .workEndTime(endTime)
//                .build();
//
//        String startTimeStr = "09:00 am";
//        String endTimeStr = "7:30 pm";
//
//        Date startTime = sdf.parse(startTimeStr);
//        Date endTime = sdf.parse(endTimeStr);
//
//        Kitchen kitchen3 = Kitchen.builder()
//                .name("Little Wadiyah")
//                .email("littlewadiyah@gmail.com")
//                .password("password")
//                .image("img_3")
//                .workDays("1111111")
//                .workStartTime(startTime)
//                .workEndTime(endTime)
//                .build();

        kitchenRepo.save(kitchen1);
    }

    @Test
    public void findAllKitchen(){
        List<Kitchen> kitchens = kitchenRepo.findAll();
        System.out.println("kitchens = " + kitchens);
    }

    @Test
    public void findKitchenById(){
        Kitchen kitchen = kitchenRepo.findById(2L).get();

        System.out.println("kitchen = " + kitchen);

    }

    @Test
    public void updateKitchenNameAndEmailById(){
        kitchenRepo.updateKitchenNameAndEmailById("Maria Kitchen","mariakitchen@gmail.com", 1L);
    }

    @Test
    public void deleteKitchen(){
        kitchenRepo.deleteById(1L);
    }


}
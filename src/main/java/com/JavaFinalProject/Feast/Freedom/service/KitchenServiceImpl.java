package com.JavaFinalProject.Feast.Freedom.service;

import com.JavaFinalProject.Feast.Freedom.entity.Kitchen;
import com.JavaFinalProject.Feast.Freedom.repository.KitchenRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class KitchenServiceImpl implements KitchenService{

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


}
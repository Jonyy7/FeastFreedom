package com.JavaFinalProject.Feast.Freedom.service;

import com.JavaFinalProject.Feast.Freedom.repository.ImageRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ImageServiceImplTest {

    @Mock
    private ImageRepository imageRepo;

    @InjectMocks
    @Autowired
    private ImageServiceImpl imageService;

//    @Test
//    public void testServiceGetImageByKitchenId(){
//        imageService.getImageByKitchenId(1l);
//    }

}

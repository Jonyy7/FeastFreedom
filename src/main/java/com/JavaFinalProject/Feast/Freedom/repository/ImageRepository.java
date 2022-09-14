package com.JavaFinalProject.Feast.Freedom.repository;

import com.JavaFinalProject.Feast.Freedom.entity.Image;
import com.JavaFinalProject.Feast.Freedom.entity.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

//    Image findByTitle(String title);  // TODO: change to find by kitchen_id

//    Image findByKitchenId(Long id);
//     Image findByFileName(String name);  // find the image that has the given kitchen id
}

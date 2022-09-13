package com.JavaFinalProject.Feast.Freedom.repository;

import com.JavaFinalProject.Feast.Freedom.entity.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface KitchenRepository extends JpaRepository<Kitchen, Long> {

    @Modifying
    @Transactional
    @Query(
            value = "update kitchen set kitchen_name = ?1, kitchen_email = ?2 where kitchen_id = ?3",
            nativeQuery = true
    )
    int updateKitchenNameAndEmailById(String name, String email, Long id);
}

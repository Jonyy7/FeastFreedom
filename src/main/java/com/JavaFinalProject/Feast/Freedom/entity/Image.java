package com.JavaFinalProject.Feast.Freedom.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Image {

    @Id
    @GeneratedValue
    private Long id;
    private String imagePath;  // from s3
    private String imageFileName; // from s3

    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "kitchen_id",
            referencedColumnName = "kitchenId"
    )
    private Kitchen kitchen;


}

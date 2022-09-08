package com.JavaFinalProject.Feast.Freedom.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Kitchen {


    private Long id;
    private String name;
    private String email;
    private String password;
    private String image;
    private String workDays;
    private String workTime;

    public void add(){}

}

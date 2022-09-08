package com.JavaFinalProject.Feast.Freedom.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Kitchen {


    @Id
    @SequenceGenerator(
            name = "kitchen_sequence",
            sequenceName = "kitchen_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "kitchen_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private String password;
    // TODO: figure out how to store image in sql database
    private String image;
    private String workDays; // "1110001"
    @Temporal(TemporalType.TIME)
    private Date workStartTime;
    @Temporal(TemporalType.TIME)
    private Date workEndTime;

}

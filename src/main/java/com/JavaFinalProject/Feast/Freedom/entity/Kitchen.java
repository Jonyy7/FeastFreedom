package com.JavaFinalProject.Feast.Freedom.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
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
    private Long kitchenId;
    private String kitchenName;
    private String kitchenEmail;
    private String kitchenPassword;
    // TODO: figure out how to store image in sql database
    private String kitchenImage;
    private String workDays; // "1110001"
    private String workStartTime;
    private String workEndTime;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "kitchen_id",
            referencedColumnName = "kitchenId"
    )
    private List<Menu> menus;
}

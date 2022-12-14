package com.JavaFinalProject.Feast.Freedom.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

    @NotNull(message = "Please provide a name for your Kitchen")
    private String kitchenName;
    
    @NotNull(message = "Email is required")
    private String kitchenEmail;
    
    @NotNull
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String kitchenPassword;
    
    @NotNull(message = "Working Days are Required")
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

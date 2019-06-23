package com.example.model;

import lombok.Data;

import javax.persistence.*;
import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "CAR")
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private Energie energie;
    private int horsePower;
    private Color color;
    private String speedGear;
    private Long mileAge;
    /*@OneToMany
    private List<Picture> pictures;*/


}

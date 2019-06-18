package com.example.model;

import lombok.Data;

import javax.persistence.Entity;
import java.awt.*;
import java.util.List;

@Data
@Entity
public class Car {
    private Long id;

    private String brand;
    private String model;
    private Energie energie;
    private int horsePower;
    private Color color;
    private String speedGear;
    private Long mileAge;
    private List<Picture> pictures;


}

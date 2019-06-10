package com.example.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "ADRESS")
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetNumber;
    private String street;
    private String city;
    private String state;
}

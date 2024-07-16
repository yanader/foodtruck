package com.yanader.foodtruck.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name="trucks")
@Entity
public class FoodTruck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long truckId;
    private long ownerId;   // This will be set as a foreign key in a many to many relationship
    private String truckName;
    private String description;

}

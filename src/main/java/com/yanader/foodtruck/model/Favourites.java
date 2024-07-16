package com.yanader.foodtruck.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name="favourites")
@Entity
public class Favourites {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long favouriteId;
    private long userId; //FOREIGN KEY
    private long truckId; //FOREIGN KEY
    private LocalDate addedAsFavourite;
}

package com.yanader.foodtruck.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name="reviews")
@Entity
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reviewId;
    private long userId; //FOREIGN KEY
    private long truckId; //FOREIGN KEY
    private int rating; //1 to 5 capped
    private String text;
    private LocalDate createdOn;
}

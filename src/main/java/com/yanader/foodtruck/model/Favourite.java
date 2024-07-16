package com.yanader.foodtruck.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name="favourites")
@Entity
public class Favourite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long favouriteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "truck_id", nullable = false)
    private FoodTruck foodTruck;

    @Column(nullable = false, updatable = false)
    private final LocalDateTime addedAt = LocalDateTime.now();
}

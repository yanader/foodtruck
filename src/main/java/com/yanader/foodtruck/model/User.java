package com.yanader.foodtruck.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Table(name="users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false, unique = true)
    private String userEmail;

    @Column(nullable = false)
    private boolean isTruckOwner;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Column(nullable = false, updatable = false)
    private final LocalDateTime createdOn = LocalDateTime.now();

    @OneToMany(mappedBy = "user")
    private Set<FoodTruck> foodTrucks;

    @OneToMany(mappedBy = "user")
    private Set<Favourite> favourites;

    @OneToMany(mappedBy = "user")
    private Set<Review> reviews;
}


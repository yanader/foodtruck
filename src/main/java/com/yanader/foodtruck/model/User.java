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

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public boolean isTruckOwner() {
        return isTruckOwner;
    }

    public UserType getUserType() {
        return userType;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public Set<FoodTruck> getFoodTrucks() {
        return foodTrucks;
    }

    public Set<Favourite> getFavourites() {
        return favourites;
    }

    public Set<Review> getReviews() {
        return reviews;
    }
}


package com.yanader.foodtruck.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

import java.time.LocalDateTime;

@Table(name="reviews")
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reviewId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "truck_id", nullable = false)
    private FoodTruck foodTruck;

    @Min(1)
    @Max(5)
    @Column(nullable = false)
    private int rating;
    @Column(nullable = false)//1 to 5 capped
    private String text;
    @Column(nullable = false, updatable = false)
    private final LocalDateTime createdOn = LocalDateTime.now();

    public long getReviewId() {
        return reviewId;
    }

    public User getUser() {
        return user;
    }

    public FoodTruck getFoodTruck() {
        return foodTruck;
    }

    @Min(1)
    @Max(5)
    public int getRating() {
        return rating;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }
}

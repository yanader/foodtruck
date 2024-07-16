package com.yanader.foodtruck.model;

import jakarta.persistence.*;

import java.util.Set;

@Table(name="trucks")
@Entity
public class FoodTruck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long truckId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String truckName;

    private String description;

    @OneToMany(mappedBy = "foodTruck")
    private Set<Schedule> schedules;
}

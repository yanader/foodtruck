package com.yanader.foodtruck.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private User user;

    @Column(nullable = false)
    private String truckName;

    private String description;

    @OneToMany(mappedBy = "foodTruck")
    private Set<Schedule> schedules;

    public long getTruckId() {
        return truckId;
    }

    public User getUser() {
        return user;
    }

    public String getTruckName() {
        return truckName;
    }

    public String getDescription() {
        return description;
    }

    public Set<Schedule> getSchedules() {
        return schedules;
    }
}

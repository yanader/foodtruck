package com.yanader.foodtruck.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Table(name="schedule")
@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long scheduleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "truck_id", nullable = false)
    private FoodTruck foodTruck;

    @Column(nullable = false)
    private LocalDateTime startTime;
    @Column(nullable = false)
    private LocalDateTime endTime;

    @Column(nullable = false)
    private String locationName;
    @Column(nullable = false)
    private double latitude;
    @Column(nullable = false)
    private double longitude;

    public long getScheduleId() {
        return scheduleId;
    }

    public FoodTruck getFoodTruck() {
        return foodTruck;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getLocationName() {
        return locationName;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}

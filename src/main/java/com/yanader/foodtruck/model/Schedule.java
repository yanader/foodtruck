package com.yanader.foodtruck.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Table(name="schedule")
@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long scheduleId;
    private long truckId; // FOREIGN KEY
    private LocalDate startTime;
    private LocalDate endTime;
    private String locationName;
    private double latitude;
    private double longitude;
}

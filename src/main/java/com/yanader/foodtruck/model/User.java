package com.yanader.foodtruck.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name="users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String userName;
    private String userEmail;
    private UserType userType;
    private LocalDate createdOn;
}


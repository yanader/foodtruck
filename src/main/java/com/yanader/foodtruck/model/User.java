package com.yanader.foodtruck.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Table(name="users")
@Entity
public class User {
    @Id
    private long userId;
    private String userName;
    private String userEmail;
    private UserType userType;
    private LocalDate createdOn;
}


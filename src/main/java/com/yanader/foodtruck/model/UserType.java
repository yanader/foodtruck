package com.yanader.foodtruck.model;

import jakarta.persistence.Entity;

public enum UserType {
    TRUCK("Truck owner"),
    CUSTOMER("Customer");

    private final String description;

    UserType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

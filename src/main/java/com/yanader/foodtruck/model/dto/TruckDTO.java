package com.yanader.foodtruck.model.dto;

import com.yanader.foodtruck.model.FoodTruck;
import com.yanader.foodtruck.model.User;

public class TruckDTO {
    private long truckId;
    private String truckName;
    private String description;

    public TruckDTO(FoodTruck truck) {
        this.truckId = truck.getTruckId();
        this.truckName = truck.getTruckName();
        this.description = truck.getDescription();
    }

    public long getTruckId() {
        return truckId;
    }

    public String getTruckName() {
        return truckName;
    }

    public String getDescription() {
        return description;
    }
}

package com.yanader.foodtruck.service;

import com.yanader.foodtruck.model.FoodTruck;

public interface TruckService {
    Iterable<FoodTruck> getAllTrucks();
}

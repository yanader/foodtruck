package com.yanader.foodtruck.service;

import com.yanader.foodtruck.model.FoodTruck;

import java.util.List;

public interface TruckService {
    Iterable<FoodTruck> getAllTrucks();
}

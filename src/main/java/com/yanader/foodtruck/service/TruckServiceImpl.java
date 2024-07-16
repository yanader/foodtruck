package com.yanader.foodtruck.service;

import com.yanader.foodtruck.repository.TruckRepository;
import com.yanader.foodtruck.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TruckServiceImpl {

    @Autowired
    TruckRepository truckRepository;

    public Iterable<FoodTruck> getAllFoodTrucks() {
        return truckRepository.findAll();
    }
}

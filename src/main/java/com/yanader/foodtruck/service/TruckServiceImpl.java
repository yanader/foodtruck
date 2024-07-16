package com.yanader.foodtruck.service;

import com.yanader.foodtruck.repository.TruckRepository;
import com.yanader.foodtruck.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TruckServiceImpl implements TruckService {

    @Autowired
    TruckRepository truckRepository;

    @Override
    public Iterable<FoodTruck> getAllTrucks() {
        return truckRepository.findAll();
    }
}

package com.yanader.foodtruck.service;

import com.yanader.foodtruck.model.dto.TruckDTO;
import com.yanader.foodtruck.repository.TruckRepository;
import com.yanader.foodtruck.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckServiceImpl implements TruckService {

    @Autowired
    TruckRepository truckRepository;

    @Override
    public Iterable<TruckDTO> getAllTrucks() {
        List<FoodTruck> trucks = (List<FoodTruck>)truckRepository.findAll();
        return trucks.stream().map(TruckDTO::new).toList();
    }
}

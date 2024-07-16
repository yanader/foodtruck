package com.yanader.foodtruck.controller;

import com.yanader.foodtruck.model.FoodTruck;
import com.yanader.foodtruck.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/trucks")
public class TruckController {

    @Autowired
    TruckService truckService;

    @GetMapping
    public ResponseEntity<Iterable<FoodTruck>> getAllFoodTrucks() {
        Iterable<FoodTruck> allTrucks = truckService.getAllTrucks();
        return new ResponseEntity<>(allTrucks, HttpStatus.OK);
    }
}

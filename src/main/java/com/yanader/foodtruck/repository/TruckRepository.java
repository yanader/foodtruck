package com.yanader.foodtruck.repository;

import com.yanader.foodtruck.model.FoodTruck;
import org.springframework.data.repository.CrudRepository;

public interface TruckRepository extends CrudRepository<FoodTruck, Long> {
}

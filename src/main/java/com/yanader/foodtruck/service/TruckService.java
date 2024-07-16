package com.yanader.foodtruck.service;

import com.yanader.foodtruck.model.dto.TruckDTO;

public interface TruckService {
    Iterable<TruckDTO> getAllTrucks();
}

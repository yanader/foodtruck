package com.yanader.foodtruck.service;

import com.yanader.foodtruck.model.dto.UserDTO;

public interface UserService {
    UserDTO findDistinctByID(long id);
    UserDTO findDistinctByEmail(String email);
}

package com.yanader.foodtruck.service;

import com.yanader.foodtruck.model.User;
import com.yanader.foodtruck.model.dto.UserDTO;
import com.yanader.foodtruck.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO findDistinctByID(long id) {
        Optional<User> optional = userRepository.findById(id);
        return optional.map(UserDTO::new).orElse(null);

    }

    @Override
    public UserDTO findDistinctByEmail(String email) {
        return null;
    }
}

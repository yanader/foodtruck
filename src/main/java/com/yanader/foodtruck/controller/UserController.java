package com.yanader.foodtruck.controller;


import com.yanader.foodtruck.model.dto.UserDTO;
import com.yanader.foodtruck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{userid}")
    public ResponseEntity<UserDTO> getAllFoodTrucks(@PathVariable long userid) {
        UserDTO user = userService.findDistinctByID(userid);
        if (user == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User Not Found");
        } else {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }

    }
}

package com.yanader.foodtruck.model.dto;

import com.yanader.foodtruck.model.User;
import com.yanader.foodtruck.model.UserType;

public class UserDTO {
    private long userId;
    private String userName;
    private String userEmail;
    private boolean isTruckOwner;
    private UserType userType;

    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.userName = user.getUserName();
        this.userEmail = user.getUserEmail();
        this.isTruckOwner = user.isTruckOwner();
        this.userType = user.getUserType();
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public boolean isTruckOwner() {
        return isTruckOwner;
    }

    public UserType getUserType() {
        return userType;
    }
}

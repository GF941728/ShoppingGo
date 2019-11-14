package com.shop.mall.controller;

import com.shop.mall.response.UserResponse;
import com.shop.mall.service.UserService;
import com.shop.mall.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/user/login")
    public boolean login(UserModel userModel) throws NullPointerException {

        if (userModel.getUserName() == null || userModel.getUserName().isEmpty() || userModel.getPassword() == null || userModel.getPassword().isEmpty()) {
            throw new NullPointerException("請輸入帳號或密碼");
        }
            return userService.isUserExist(userModel);
    }

    @PostMapping(value = "/user/createUser")
    public UserResponse createUser(UserModel userModel){
        return userService.createUser(userModel);
    }

}

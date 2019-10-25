package com.wesley.mall.controller;

import com.wesley.mall.model.UserModel;
import com.wesley.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(name = "/user/login")
    public boolean login(UserModel userModel) throws NullPointerException {

        if (userModel.getUserName() == null || userModel.getUserName().isEmpty() || userModel.getPassword() == null || userModel.getPassword().isEmpty()) {
            throw new NullPointerException("請輸入帳號或密碼");
        }
            return userService.isUserExist(userModel);
    }
}

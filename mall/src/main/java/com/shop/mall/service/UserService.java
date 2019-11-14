package com.shop.mall.service;

import com.shop.mall.model.UserModel;
import com.shop.mall.po.User;
import com.shop.mall.response.UserResponse;

public interface UserService {

    UserResponse createUser(UserModel userModel);

    boolean isUserExist(UserModel userModel);

    UserResponse editUser(User user);


}

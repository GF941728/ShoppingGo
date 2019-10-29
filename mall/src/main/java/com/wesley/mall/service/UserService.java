package com.wesley.mall.service;

import com.wesley.mall.model.UserModel;
import com.wesley.mall.po.User;
import com.wesley.mall.response.UserResponse;

public interface UserService {

    UserResponse createUser(UserModel userModel);

    boolean isUserExist(UserModel userModel);

    UserResponse editUser(User user);


}

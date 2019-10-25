package com.wesley.mall.service;

import com.wesley.mall.model.UserModel;
import com.wesley.mall.po.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User createUser(UserModel userModel);

    boolean isUserExist(UserModel userModel);



}

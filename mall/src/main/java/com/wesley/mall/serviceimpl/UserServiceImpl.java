package com.wesley.mall.serviceimpl;

import com.wesley.mall.model.UserModel;
import com.wesley.mall.po.User;
import com.wesley.mall.repository.UserRepository;
import com.wesley.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public User createUser(UserModel userModel) {
        User user = new User();
        return userRepository.save(user);
    }

    @Override
    public boolean isUserExist(UserModel userModel) {
        return false;
    }


}

package com.shop.mall.serviceimpl;

import com.shop.mall.po.User;
import com.shop.mall.response.UserResponse;
import com.shop.mall.service.UserService;
import com.shop.mall.model.UserModel;
import com.shop.mall.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public UserResponse createUser(UserModel userModel) {
        UserResponse userResponse = new UserResponse();
        User user = new User();
        try {

            user.setUserName(userModel.getUserName());
            user.setPassword(userModel.getPassword());
            user.setRealName(userModel.getRealName());
            user.setPhone(userModel.getPhone());
            userRepository.save(user);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        userResponse.setUser(user);
        userResponse.setSuccess(true);
        return userResponse;
    }


    @Override
    public UserResponse editUser(User user) {
        UserResponse userResponse = new UserResponse();
         userRepository.save(user);
         userResponse.setUser(user);
         userResponse.setSuccess(true);
         return userResponse;
    }

    @Override
    public boolean isUserExist(UserModel userModel) {
        return userRepository.findUserByUserNameAndPassword(userModel.getUserName(), userModel.getPassword());
    }


}

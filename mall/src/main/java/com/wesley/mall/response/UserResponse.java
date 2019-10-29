package com.wesley.mall.response;

import com.wesley.mall.po.User;

public class UserResponse {

    private boolean success = false;
    private User user;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

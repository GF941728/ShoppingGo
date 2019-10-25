package com.wesley.mall.model;

import javax.validation.constraints.NotBlank;

public class UserModel {

    @NotBlank
    private String userName;

    @NotBlank
    private String password;

    private String realName;

    private int phone;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}

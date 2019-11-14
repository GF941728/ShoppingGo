package com.shop.mall.po;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    @NotBlank
    private String userName;

    @Column(name = "pass_word")
    @NotBlank
    private String password;

    @Column(name = "real_name")
    @NotBlank
    private String realName;

    @Column(name = "phone")
    private String  phone;

    @OneToMany(mappedBy = "goodsDiscussUser", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<GoodsDiscuss> goodsDiscussList;

    @OneToMany(mappedBy = "orderUserId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> orderList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<GoodsDiscuss> getGoodsDiscussList() {
        return goodsDiscussList;
    }

    public void setGoodsDiscussList(List<GoodsDiscuss> goodsDiscussList) {
        this.goodsDiscussList = goodsDiscussList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}

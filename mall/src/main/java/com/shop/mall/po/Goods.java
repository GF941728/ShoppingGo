package com.shop.mall.po;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "goods")
public class Goods implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "goodsDiscussName", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<GoodsDiscuss> goodsDiscussList;

    @OneToMany(mappedBy = "goodsDetail", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetailList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;

    }

    public List<GoodsDiscuss> getGoodsDiscussList() {
        return goodsDiscussList;
    }

    public void setGoodsDiscussList(List<GoodsDiscuss> goodsDiscussList) {
        this.goodsDiscussList = goodsDiscussList;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}



package com.wesley.mall.po;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "orderDetail", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetailList;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User orderUserId;

    @Column(name = "total_price")
    private int totalPrice;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public User getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(User orderUserId) {
        this.orderUserId = orderUserId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}

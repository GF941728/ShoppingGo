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


    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}

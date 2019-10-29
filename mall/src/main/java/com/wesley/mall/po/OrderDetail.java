package com.wesley.mall.po;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "order_detail")
public class OrderDetail implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "goods_id")
    private Goods goodsDetail;

    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order orderDetail;

    @Column(name = "amount")
    private int amount;


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

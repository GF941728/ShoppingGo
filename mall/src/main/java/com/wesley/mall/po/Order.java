package com.wesley.mall.po;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToMany(mappedBy = "orderList")
    private List<User> userList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

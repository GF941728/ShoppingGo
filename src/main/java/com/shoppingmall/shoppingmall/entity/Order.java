package com.shoppingmall.shoppingmall.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_t")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;



    @ManyToMany
    @JoinTable(name = "order_detail",joinColumns = @JoinColumn(name = "product_id"))
    private List<Product> order;

    public List<Product> getOrder() {
        return order;
    }

    public void setOrder(List<Product> order) {
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}

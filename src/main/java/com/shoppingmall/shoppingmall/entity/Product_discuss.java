package com.shoppingmall.shoppingmall.entity;

import javax.persistence.*;

@Entity
@Table(name = "product_discuss")
public class Product_discuss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "discuss")
    private String discuss;


    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product_id;

}

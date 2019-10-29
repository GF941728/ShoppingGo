package com.wesley.mall.po;

import javax.persistence.*;

@Entity
@Table(name = "goods_discuss")
public class GoodsDiscuss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "goods_name")
    private Goods goodsDiscussName;

    @ManyToOne
    @JoinColumn(name = "user_name")
    private User goodsDiscussUser;

    @Column(name = "goods_discussion")
    private String goodsDiscussion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getGoodsDiscussUser() {
        return goodsDiscussUser;
    }

    public void setGoodsDiscussUser(User goodsDiscussUser) {
        this.goodsDiscussUser = goodsDiscussUser;
    }
}

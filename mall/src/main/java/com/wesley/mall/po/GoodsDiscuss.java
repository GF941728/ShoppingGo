package com.wesley.mall.po;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "goods_discuss")
public class GoodsDiscuss implements Serializable {

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

    public Goods getGoodsDiscussName() {
        return goodsDiscussName;
    }

    public void setGoodsDiscussName(Goods goodsDiscussName) {
        this.goodsDiscussName = goodsDiscussName;
    }

    public User getGoodsDiscussUser() {
        return goodsDiscussUser;
    }

    public void setGoodsDiscussUser(User goodsDiscussUser) {
        this.goodsDiscussUser = goodsDiscussUser;
    }

    public String getGoodsDiscussion() {
        return goodsDiscussion;
    }

    public void setGoodsDiscussion(String goodsDiscussion) {
        this.goodsDiscussion = goodsDiscussion;
    }
}

package com.shop.mall.response;

import com.shop.mall.po.Goods;

public class GoodsResponse {

    private Goods goods;
    private boolean success = false;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

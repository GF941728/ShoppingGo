package com.shop.mall.service;


import com.shop.mall.model.GoodsModel;
import com.shop.mall.response.GoodsResponse;
import com.shop.mall.po.Goods;

import java.util.List;

public interface GoodsService {

    GoodsResponse insertGoods(GoodsModel goodsModel);

    List<Goods> findByName(String goodsName);

    Goods editGoods(Goods goods);

    boolean deleteGoods(int id);
}

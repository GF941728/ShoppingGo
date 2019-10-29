package com.wesley.mall.service;


import com.wesley.mall.model.GoodsModel;
import com.wesley.mall.po.Goods;
import com.wesley.mall.response.GoodsResponse;

import java.util.List;

public interface GoodsService {

    GoodsResponse insertGoods(GoodsModel goodsModel);

    List<Goods> findByName(String goodsName);

    Goods editGoods(Goods goods);

    boolean deleteGoods(int id);
}

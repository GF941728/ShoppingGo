package com.wesley.mall.service;


import com.wesley.mall.model.GoodsModel;
import com.wesley.mall.po.Goods;

import java.util.List;

public interface GoodsService {

    GoodsModel insertGoods(GoodsModel goodsModel);

    List<Goods> findByName(String goodsName);

    Goods editGoods(Goods goods);

    boolean deleteGoods(int id);
}

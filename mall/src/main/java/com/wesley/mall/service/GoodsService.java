package com.wesley.mall.service;


import com.wesley.mall.po.Goods;

import java.util.List;

public interface GoodsService {

    List<Goods> getAll();

    Goods insertGoods(Goods goods);

    List<Goods> findByName(String goodsName);

    Goods editGoods(int id);

    boolean deleteGoods(int id);
}

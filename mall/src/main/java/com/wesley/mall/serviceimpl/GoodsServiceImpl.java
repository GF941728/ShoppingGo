package com.wesley.mall.serviceimpl;

import com.wesley.mall.po.Goods;
import com.wesley.mall.repository.GoodsRepository;
import com.wesley.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsRepository goodsRepository;

    @Override
    public Goods insertGoods(Goods goods) {
        return goodsRepository.save(goods);
    }

    @Override
    public List<Goods> getAll() {
        return goodsRepository.findAll();
    }


    @Override
    public List<Goods> findByName(String goodsName) {
        return goodsRepository.findByName(goodsName);
    }

    @Override
    public Goods editGoods(int id) {
        return null;
    }

    @Override
    public boolean deleteGoods(int id) {
        return false;
    }

}

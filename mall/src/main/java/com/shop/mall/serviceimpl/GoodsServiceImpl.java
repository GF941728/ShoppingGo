package com.shop.mall.serviceimpl;

import com.shop.mall.model.GoodsModel;
import com.shop.mall.response.GoodsResponse;
import com.shop.mall.service.GoodsService;
import com.shop.mall.po.Goods;
import com.shop.mall.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsRepository goodsRepository;


    @Override
    public GoodsResponse insertGoods(GoodsModel goodsModel) {
        Goods goods = new Goods();
        GoodsResponse goodsResponse = new GoodsResponse();
        goods.setName(goodsModel.getName());
        goods.setPrice(goodsModel.getPrice());
        goods.setDescription(goodsModel.getDescription());
        goodsRepository.save(goods);

        goodsResponse.setGoods(goods);
        goodsResponse.setSuccess(true);

        return goodsResponse;
    }

    @Override
    public List<Goods> findByName(String goodsName) {
        return goodsRepository.findByName(goodsName);
    }

    @Override
    public Goods editGoods(Goods goods) {
        return goodsRepository.save(goods);
    }

    @Override
    public boolean deleteGoods(int id) {
        boolean success = false;
        try {
            goodsRepository.deleteById(id);
            success = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return success;
    }

}

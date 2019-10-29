package com.wesley.mall.serviceimpl;

import com.wesley.mall.model.GoodsModel;
import com.wesley.mall.po.Goods;
import com.wesley.mall.repository.GoodsRepository;
import com.wesley.mall.response.GoodsResponse;
import com.wesley.mall.service.GoodsService;
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

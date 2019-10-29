package com.wesley.mall.controller;

import com.wesley.mall.model.GoodsModel;
import com.wesley.mall.po.Goods;
import com.wesley.mall.response.GoodsResponse;
import com.wesley.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    GoodsService goodsService;



    @GetMapping(value = "/goods/findByName")
    public List<Goods> find(String name){
        return goodsService.findByName(name);
    }

    @PostMapping(value = "/goods/insertGoods")
    public GoodsResponse insertGoods(GoodsModel goodsModel){
        return goodsService.insertGoods(goodsModel);
    }

    @PutMapping(value = "/goods/editGoods")
    public Goods editGoods(Goods goods){
        return goodsService.editGoods(goods);
    }

    @DeleteMapping("/goods/deleteGoods")
    public boolean deleteGoods(int id){
        return goodsService.deleteGoods(id);
    }

}

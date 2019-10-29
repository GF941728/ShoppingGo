package com.wesley.mall.controller;

import com.wesley.mall.model.GoodsModel;
import com.wesley.mall.po.Goods;
import com.wesley.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    GoodsService goodsService;



    @GetMapping(name = "/goods/findByName")
    public List<Goods> find(String name){
        return goodsService.findByName(name);
    }

    @PostMapping(name = "/goods/insertGoods")
    public Goods insertGoods(GoodsModel goodsModel){
        return goodsModel.
    }

    @PutMapping(name = "/goods/editGoods")
    public Goods editGoods(Goods goods){
        return goodsService.editGoods(goods);
    }

    @DeleteMapping("/goods/deleteGoods")
    public boolean deleteGoods(int id){
        return goodsService.deleteGoods(id);
    }

}

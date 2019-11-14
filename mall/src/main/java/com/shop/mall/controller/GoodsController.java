package com.shop.mall.controller;

import com.shop.mall.model.GoodsModel;
import com.shop.mall.po.Goods;
import com.shop.mall.response.GoodsResponse;
import com.shop.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    GoodsService goodsService;



    @GetMapping(value = "/goods/findByName")
    public List<Goods> find(@RequestParam String name){
        return goodsService.findByName(name);
    }

    @PostMapping(value = "/goods/insertGoods")
    public GoodsResponse insertGoods(@RequestBody GoodsModel goodsModel){
        return goodsService.insertGoods(goodsModel);
    }

    @PutMapping(value = "/goods/editGoods")
    public Goods editGoods(@RequestBody Goods goods){
        return goodsService.editGoods(goods);
    }

    @DeleteMapping("/goods/deleteGoods")
    public boolean deleteGoods(@RequestParam int id){
        return goodsService.deleteGoods(id);
    }



}

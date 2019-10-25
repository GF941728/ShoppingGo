package com.wesley.mall.controller;

import com.wesley.mall.po.Goods;
import com.wesley.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @PostMapping(name = "/goods/insertGoods")
    public Goods insertGoods(Goods goods){
        return goodsService.insertGoods(goods);
    }

    @GetMapping(name = "/goods/findByName")
    public List<Goods> find(String name){
        return goodsService.findByName(name);
    }

    @GetMapping(name = "/goods/getAll")
    public List<Goods> getAll(){
        return goodsService.getAll();
    }

    @PutMapping(name = "/goods/editGoods")
    public Goods editGoods(int id){
        return goodsService.editGoods(id);
    }

    @DeleteMapping("/goods/deleteGoods")
    public boolean deleteGoods(int id){
        return goodsService.deleteGoods(id);
    }

}

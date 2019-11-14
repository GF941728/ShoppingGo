package com.shop.mall.repository;

import com.shop.mall.po.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Integer> {

    @Query(value = "SELECT * FROM goods WHERE name LIKE %?1%", nativeQuery = true)
    List<Goods> findByName(String goodsName);



}

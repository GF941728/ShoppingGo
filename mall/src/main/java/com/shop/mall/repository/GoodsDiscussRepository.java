package com.shop.mall.repository;

import com.shop.mall.po.GoodsDiscuss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsDiscussRepository extends JpaRepository<GoodsDiscuss, Integer> {



}

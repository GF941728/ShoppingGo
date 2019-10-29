package com.wesley.mall.repository;

import com.wesley.mall.po.GoodsDiscuss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsDiscussRepository extends JpaRepository<GoodsDiscuss, Integer> {



}

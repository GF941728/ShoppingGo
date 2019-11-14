package com.shop.mall.service;

import com.shop.mall.response.OrderResponse;
import com.shop.mall.po.Order;

public interface OrderService {

    OrderResponse insertOrder(Order order);

    boolean deleteOrder();

}

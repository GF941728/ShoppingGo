package com.wesley.mall.service;

import com.wesley.mall.po.Order;
import com.wesley.mall.response.OrderResponse;

public interface OrderService {

    OrderResponse insertOrder(Order order);

    boolean deleteOrder();

}

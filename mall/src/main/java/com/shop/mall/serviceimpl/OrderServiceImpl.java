package com.shop.mall.serviceimpl;

import com.shop.mall.repository.OrderRepository;
import com.shop.mall.response.OrderResponse;
import com.shop.mall.service.OrderService;
import com.shop.mall.po.Order;
import com.shop.mall.po.OrderDetail;
import com.shop.mall.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderDetailRepository orderDetailRepository;


    @Override
    public OrderResponse insertOrder(Order order) {
        OrderResponse response = new OrderResponse();
        OrderDetail orderDetail = new OrderDetail();

        Order order1 = orderRepository.save(order);
        orderDetail.setOrderDetail(order1);




        return null;
    }

    @Override
    public boolean deleteOrder() {
        return false;
    }
}

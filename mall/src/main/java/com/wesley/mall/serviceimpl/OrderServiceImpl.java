package com.wesley.mall.serviceimpl;

import com.wesley.mall.po.Order;
import com.wesley.mall.po.OrderDetail;
import com.wesley.mall.repository.OrderDetailRepository;
import com.wesley.mall.repository.OrderRepository;
import com.wesley.mall.response.OrderResponse;
import com.wesley.mall.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.session.WebSessionManager;

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

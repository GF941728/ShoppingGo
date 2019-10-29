package com.wesley.mall.response;

import com.wesley.mall.po.Order;

public class OrderResponse {

    private Order order;
    private boolean success = false;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

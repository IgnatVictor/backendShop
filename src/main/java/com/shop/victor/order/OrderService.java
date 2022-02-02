package com.shop.victor.order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

//    public List<Order> FindOrders(int user_id) {
//        return orderRepository.findAllByUser_id(user_id);
//    }
//
//    public void addOrder(Order order) {
//        orderRepository.save(order);
//    }
}

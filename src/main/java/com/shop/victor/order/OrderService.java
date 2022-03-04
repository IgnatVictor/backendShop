package com.shop.victor.order;


import com.shop.victor.orderItem.OrderItem;
import com.shop.victor.orderItem.OrderItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemsRepository orderItemsRepository;

    public List<Order> FindOrders(int user_id) {
        return orderRepository.findAllByUserId(user_id);
    }

    public void addOrder(Order order) {
        orderRepository.save(order);
        List<OrderItem> items= order.getOrderItems();
        for(OrderItem item: items) {
            OrderItem orderItem = new OrderItem();
            orderItem.setCreatedDate(new Date());
            orderItem.setPrice(item.getPrice());
            orderItem.setProduct(item.getProduct());
            orderItem.setQuantity(item.getQuantity());
            orderItem.setOrders(new Order());

            orderItemsRepository.save(orderItem);
        }
    }
}

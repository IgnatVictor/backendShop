package com.shop.victor.orderItem;



import com.shop.victor.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderItemsService {


    @Autowired
    private OrderItemsRepository orderItemsRepository;



    public void addOrderedProducts(OrderItem orderItem) {
        orderItemsRepository.save(orderItem);
    }


    public List<OrderItem> FindOrders(Long order) {
        return orderItemsRepository.getOrdersByOrderID(order);
    }


}
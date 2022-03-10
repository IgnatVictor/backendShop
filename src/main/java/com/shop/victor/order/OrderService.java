package com.shop.victor.order;


import com.shop.victor.orderItem.OrderItem;
import com.shop.victor.orderItem.OrderItemsRepository;
import com.shop.victor.products.Products;
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

    public List<Order> FindOrders(String user_id) {
        int userId= Integer.parseInt(user_id);
        return orderRepository.findOrdersByUserId(userId);
    }

    public void addOrder(Order order) {
        orderRepository.save(order);
        List<OrderItem> items= order.getOrderItems();
        for(OrderItem item: items) {
            Products product = new Products();
            product.setId(Long.valueOf(item.getId()));
            OrderItem orderItem = new OrderItem();
            orderItem.setCreatedDate(new Date());
            orderItem.setPrice(item.getPrice());
            orderItem.setProduct(product);
            orderItem.setQty(item.getQty());
            orderItem.setOrders(order);

            orderItemsRepository.save(orderItem);
        }
    }
}

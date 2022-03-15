package com.shop.victor.orderItem;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderItemsRepository extends JpaRepository<OrderItem,Integer> {

    @Query(value= "select o from OrderItem o where o.orders.order_id=?1")
    List<OrderItem> getOrdersByOrderID(Long Order_id);
}
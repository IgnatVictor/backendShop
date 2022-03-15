package com.shop.victor.orderItem;


import com.shop.victor.order.Order;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/itemOrder")
public class OrderItemController {

    private OrderItemsService orderItemsService;

    @PostMapping("/getItems")
    public List<OrderItem> getOrders(@RequestParam( name = "order_id",required = true) Long order_id ) {
        return orderItemsService.FindOrders(order_id);
    }
}

package com.shop.victor.order;

import com.shop.victor.products.Products;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@AllArgsConstructor
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/order")
public class OrderController {


        private OrderService orderService;


    @PostMapping("/getOrders")
    public List<Order> getOrders(@RequestParam( name = "userId",required = true) String userId ) {
        return orderService.FindOrders(userId);
    }

    @PostMapping("/add")
    public  void addOrder(@RequestBody Order products)
    {
        System.out.println(products);
        orderService.addOrder(products);



    }
}

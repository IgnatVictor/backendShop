package com.shop.victor.order;

import com.shop.victor.products.Products;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/order")
public class OrderController {

        private OrderService orderService;


    @GetMapping("/getOrders")
    public List<Order> getOrders(@RequestParam( name = "user_id",required = true) int user_id ) {
        return orderService.FindOrders(user_id);
    }

    @PostMapping("/add")
    public  void addOrder(@RequestBody Order products)
    {


        System.out.println(products.toString());
        orderService.addOrder(products);
        List<Products> proba = new ArrayList<>();

//
//        Order order= new Order(proba,sum,user_id);
//        orderService.addOrder(order);

    }
}

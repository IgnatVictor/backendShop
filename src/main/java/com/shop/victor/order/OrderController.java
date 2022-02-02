package com.shop.victor.order;

import com.shop.victor.products.Products;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/order")
public class OrderController {

        private OrderService orderService;


//    @GetMapping("/getOrders")
//    public List<Order> getOrders(@RequestParam( name = "user_id",required = true) int user_id ) {
//        return orderService.FindOrders(user_id);
//    }
//
//    @PostMapping("/add")
//    public void addOrder(@RequestBody List<Products> products, @RequestParam(name = "sum", required = true) int sum,@RequestParam(name="user_id",required = true) int user_id)
//    {
//        Order order= new Order(products,sum,user_id);
//        orderService.addOrder(order);
//    }
}

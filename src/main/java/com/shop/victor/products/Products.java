package com.shop.victor.products;


import com.shop.victor.order.Order;
import com.shop.victor.orderItem.OrderItem;
import lombok.*;

import javax.persistence.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Products {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private int price;
    private String image;
    private String category;
    private int quantity;
    private int qty;

}


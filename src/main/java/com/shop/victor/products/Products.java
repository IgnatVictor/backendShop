package com.shop.victor.products;


import com.shop.victor.order.Order;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
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

    @ManyToMany(targetEntity = Order.class,cascade = CascadeType.ALL)
    @JoinColumn(name="product_id",referencedColumnName = "id")
    private List<Products> order ;






    public Products(String name, String description, int price, String image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.category= category;
        this.quantity= quantity;
    }


    @ManyToOne(optional = false)
    private Order orderrs;

    public Order getOrderrs() {
        return orderrs;
    }

    public void setOrderrs(Order orderrs) {
        this.orderrs = orderrs;
    }

    @ManyToOne(optional = false)
    private Order orders;

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }
}


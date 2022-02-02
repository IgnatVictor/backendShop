package com.shop.victor.products;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shop.victor.order.Order;
import lombok.*;

import javax.persistence.*;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Order order;





    public Products(String name, String description, int price, String image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.category= category;
        this.quantity= quantity;
    }




}


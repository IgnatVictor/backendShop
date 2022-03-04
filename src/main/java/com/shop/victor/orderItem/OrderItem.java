package com.shop.victor.orderItem;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shop.victor.order.Order;
import com.shop.victor.products.Products;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "orderItems")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;



    private @NotNull int quantity;


    private @NotNull double price;



    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "orders_id", referencedColumnName = "order_id")
    private Order orders;

//    @ManyToOne
//    @JsonIgnore
//    @JoinColumn(name = "order_id", referencedColumnName = "id")
//    private Order order;
//
    @OneToOne
    @JoinColumn(name = "products_id", referencedColumnName = "id")
    private Products product;


}

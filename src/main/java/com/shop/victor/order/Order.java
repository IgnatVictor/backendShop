package com.shop.victor.order;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.shop.victor.orderItem.OrderItem;
import com.shop.victor.products.Products;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long order_id;
    private int totalSum;
    private int userId;
    private LocalDate localDate= LocalDate.now();


    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;


    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", totalSum=" + totalSum +
                ", userId=" + userId +
                ", localDate=" + localDate +
                ", orderItems=" + orderItems +
                '}';
    }
}




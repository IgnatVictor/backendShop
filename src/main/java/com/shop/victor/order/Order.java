package com.shop.victor.order;
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



//    @ManyToMany(targetEntity = Products.class,cascade = CascadeType.ALL)
//    @JoinColumn(name="order",referencedColumnName = "order_id")
//    private List<Products> order ;

    @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;




    @Override
    public String toString() {
        return "Order{" +

                "order_id=" + order_id +
                ", order='" +  + '\'' +
                '}';
    }



}
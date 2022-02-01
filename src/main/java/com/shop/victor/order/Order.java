package com.shop.victor.order;
import com.shop.victor.products.Products;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long order_id;
    private int totalSum;
    private int user_id;
    private LocalDate localDate= LocalDate.now();



    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Order")
    private List<Products> order;

    public Order( List<Products> order, int totalSum, int user_id) {
        this.totalSum = totalSum;
        this.order = order;
        this.user_id= user_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", order='" + order + '\'' +
                '}';
    }



}
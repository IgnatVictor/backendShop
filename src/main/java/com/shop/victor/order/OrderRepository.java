package com.shop.victor.order;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.From;
import org.springframework.data.relational.core.sql.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


    List<Order> findOrdersByUserId(int user_id);




}

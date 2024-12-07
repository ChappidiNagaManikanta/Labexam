package com.klef.jfsd.repository;
import org.springframework.*;
import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.model.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
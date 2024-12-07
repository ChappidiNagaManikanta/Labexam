package com.klef.jfsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.model.Order;

@RestController
@RequestMapping("/api/orders")
public class ClientController {

    @PostMapping("/create")
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        // Business logic to handle the order creation
        String responseMessage = String.format(
            "Order created successfully! Order ID: %d, Product: %s, Quantity: %d, Date: %s, Customer: %s",
            order.getOrderId(), order.getProductName(), order.getQuantity(), order.getOrderDate(), order.getCustomerName()
        );
        return ResponseEntity.ok(responseMessage);
    }}
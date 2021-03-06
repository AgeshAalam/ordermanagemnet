package com.tfc.ordermanagement.controller;

import com.tfc.ordermanagement.dto.OrderRequestDTO;
import com.tfc.ordermanagement.model.Order;
import com.tfc.ordermanagement.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {
   @Autowired
   private OrderService orderService;
   @PostMapping("/createOrder")
   @ResponseStatus(HttpStatus.CREATED)
   public String createOrder(@RequestBody OrderRequestDTO orderRequestDTO){
 orderService.createOrder(orderRequestDTO);
 return "order placed successfully";
   }
}

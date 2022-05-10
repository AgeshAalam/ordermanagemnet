package com.tfc.ordermanagement.service;

import com.tfc.ordermanagement.dto.OrderLineItemsDTO;
import com.tfc.ordermanagement.dto.OrderRequestDTO;
import com.tfc.ordermanagement.model.Order;
import com.tfc.ordermanagement.model.OrderLineItems;
import com.tfc.ordermanagement.repository.OrderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
   private final OrderRepo orderRepo;

   public void createOrder(OrderRequestDTO orderRequestDTO) {
      Order order = new Order();
      order.setOrderNumber(UUID.randomUUID().toString());

      List<OrderLineItems> orderLineItems = orderRequestDTO.getOrderLineItemsListDTO()
              .stream()
              .map(this::mapToDto)
              .toList();
           orderRepo.save(order);
   }
      private  OrderLineItems mapToDto (OrderLineItemsDTO orderLineItemsDTO){
         OrderLineItems orderLineItems = new OrderLineItems();
         orderLineItems.setPrice(orderLineItemsDTO.getPrice());
         orderLineItems.setQuantity(orderLineItemsDTO.getQuantity());
         orderLineItems.setProductId(orderLineItemsDTO.getProductId());
         return orderLineItems;
      }
   }
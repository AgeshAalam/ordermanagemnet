package com.tfc.ordermanagement.dto;

import com.tfc.ordermanagement.model.Customer;
import com.tfc.ordermanagement.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDTO {
   private Customer customerID;
   private List<OrderLineItemsDTO> orderLineItemsListDTO;
   //private Product productId;
//private Date date_id;
   private Integer demand;
}

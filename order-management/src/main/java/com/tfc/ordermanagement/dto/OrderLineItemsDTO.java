package com.tfc.ordermanagement.dto;

import com.tfc.ordermanagement.model.OrderHeader;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDTO {
   private String orderNumber;
   @ManyToOne
   private OrderHeader orderHeaderId;
   private Integer productId;
   private Integer quantity;
   private Integer price;
}

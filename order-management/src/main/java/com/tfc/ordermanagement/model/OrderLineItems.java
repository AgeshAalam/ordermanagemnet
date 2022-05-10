package com.tfc.ordermanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderLineItems {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer order_line_id;
   private String orderNumber;
   @ManyToOne
   private OrderHeader orderHeaderId;
   private Integer productId;
   private Integer quantity;
   private Integer price;
//private Date date_id
}

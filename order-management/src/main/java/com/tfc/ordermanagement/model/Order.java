package com.tfc.ordermanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer order_id;
   private String orderNumber;
   private Integer customerID;
//private Product productId;
//private Date date_id;
private Integer demand;
@OneToMany(cascade = CascadeType.ALL)
private List<OrderLineItems> orderLineItemsList;
}

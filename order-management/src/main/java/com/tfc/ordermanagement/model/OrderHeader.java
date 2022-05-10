package com.tfc.ordermanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class OrderHeader {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
private Integer order_id;
   @ManyToOne
   private Customer customerId;
private Integer quantity;
private String status;
private DateModel create_date;
private DateModel delivery_dateModel;
private Integer total_price;
private Integer date_id;
@OneToMany(cascade = CascadeType.ALL)
private List<OrderLineItems> orderLineItems;
}

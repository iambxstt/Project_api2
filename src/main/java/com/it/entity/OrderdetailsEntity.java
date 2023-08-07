package com.it.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_orderdetails")
@Data

public class OrderdetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Integer orderId;
	
	@Column(name = "order_number")
	private Integer orderNumber;
	
	@Column(name = "order_total")
	private String orderTotal;
	
	@Column(name = "parcel_number")
	private String parcelNumber;
	
	@Column(name = "status")
	private String Status;
	
	@Column(name = "shipping_costs")
	private String shippingCosts;
	
	@Column(name = "re_id")
	private Integer reId;
	
	@Column(name = "ctm_id")
	private Integer ctmId;
	
}

package com.it.model;

import lombok.Data;

@Data
public class OrderdetailsRequestModel {
	private Integer orderId;
	private Integer orderNumber;
	private String orderTotal;
	private String parcelNumber;
	private String Status;
	private String shippingCosts;
	private Integer reId;
	private Integer ctmId;
	
}

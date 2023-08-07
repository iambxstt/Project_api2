package com.it.model;

import lombok.Data;

@Data
public class RentRequestModel {
	private Integer reId;
	private String reDate;
	private Integer reNumber;
	private Integer reInsurance;
	private String reStatusPm;
	private String reSlipPm;
	private String reFormGown;
	private Integer ctmId;
	private Integer gownId;
	
}

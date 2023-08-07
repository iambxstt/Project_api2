package com.it.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_rent")
@Data

public class RentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "re_id")
	private Integer reId;
	
	@Column(name = "re_date")
	private String reDate;
	
	@Column(name = "re_number")
	private Integer reNumber;
	
	@Column(name = "re_insurance")
	private Integer reInsurance;
	
	@Column(name = "re_status_pm")
	private String reStatusPm;
	
	@Column(name = "re_slip_pm")
	private String reSlipPm;
	
	@Column(name = "re_form_gown")
	private String reFormGown;
	
	@Column(name = "ctm_id")
	private Integer ctmId;
	
	@Column(name = "gown_id")
	private Integer gownId;
	
}

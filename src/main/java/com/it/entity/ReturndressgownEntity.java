package com.it.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_returndressgown")
@Data

public class ReturndressgownEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rd_id")
	private Integer rdId;
	
	@Column(name = "rd_date")
	private String rdDate;
	
	@Column(name = "ctm_id")
	private Integer ctmId;
	
	@Column(name = "gown_id")
	private Integer gownId;
}

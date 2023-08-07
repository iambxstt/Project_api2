package com.it.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_gown")
@Data

public class GownEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gown_id")
	private Integer gownId;
	
	@Column(name = "gown_name")
	private String gownName;
	
	@Column(name = "gown_img")
	private String gownImg;
	
	@Column(name = "gown_level")
	private String gownLevel;
	
	@Column(name = "gown_details")
	private String gownDetails;
	
	@Column(name = "role_id")
	private Integer roleId;
	
}

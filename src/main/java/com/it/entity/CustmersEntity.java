package com.it.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_custmers")
@Data

public class CustmersEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ctm_id")
	private Integer ctmId;
	
	@Column(name = "ctm_user")
	private String ctmUser;
	
	@Column(name = "ctm_password")
	private String ctmPassword;
	
	@Column(name = "ctm_title")
	private String ctmTitle;
	
	@Column(name = "ctm_firstname")
	private String ctmFirstname;
	
	@Column(name = "ctm_lastname")
	private String ctmLastname;
	
	@Column(name = "ctm_gender")
	private String ctmGender;
	
	@Column(name = "ctm_birth")
	private String ctmBirth;
	
	@Column(name = "ctm_phon")
	private String ctmPhon;
	
	@Column(name = "ctm_email")
	private String ctmEmail;
	
	@Column(name = "ctm_addrss")
	private String ctmAddrss;
	
	@Column(name = "ctm_university")
	private String ctmUniversity;
	
	@Column(name = "ctm_faculty")
	private String ctmFaculty;
	
	@Column(name = "ctm_major")
	private String ctmMajor;
	
	@Column(name = "ctm_weight")
	private String ctmWeight;
	
	@Column(name = "ctm_height")
	private String ctmHeight;
	
	@Column(name = "ctm_status")
	private String ctmStatus;
	
	@Column(name = "zip_code")
	private String zipCode;
	
	@Column(name = "role_id")
	private Integer roleId;
	
	
}

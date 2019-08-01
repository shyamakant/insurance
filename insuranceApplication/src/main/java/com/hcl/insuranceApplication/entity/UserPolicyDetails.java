package com.hcl.insuranceApplication.entity;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_policy")
public class UserPolicyDetails {
	
	@Id
	private Long id;
	private Long policyId;
	private Date purchaseDate;
	private String policyStatus;
	private Long customerId;
	private Date maturityDate;
	
	

}

package com.hcl.insuranceApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "policy")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "policyId")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "policy_id")
	private Long policyId;

	@Column(name = "policy_name")
	private String policyName;

	@Column(name = "age_limit")
	private Integer ageLimit;

	@Column(name = "base_amount")
	private Double baseAmount;

	@Column(name = "premium")
	private Double premium;

	@Column(name = "maturity")
	private int maturityYear; 
}


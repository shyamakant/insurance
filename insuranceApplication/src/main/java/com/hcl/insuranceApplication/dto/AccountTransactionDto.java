package com.hcl.insuranceApplication.dto;

import lombok.Data;

@Data
public class AccountTransactionDto {
	
	private long customerId;
	private String fromDate;
	private String toDate;

}

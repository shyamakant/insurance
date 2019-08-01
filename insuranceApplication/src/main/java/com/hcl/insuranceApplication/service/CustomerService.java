package com.hcl.insuranceApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.insuranceApplication.entity.Customer;
import com.hcl.insuranceApplication.repository.CustomerRepository;

@Service("customerService")
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	public Customer registerCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	
}

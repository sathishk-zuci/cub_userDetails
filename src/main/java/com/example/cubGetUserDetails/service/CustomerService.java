package com.example.cubGetUserDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cubGetUserDetails.entity.Customer;
import com.example.cubGetUserDetails.repository.CustomerRepository;


@Service
public class CustomerService {

	@Autowired(required=true)
	private CustomerRepository repository;

	public Customer getCustomerById(int id) {
		
		return repository.findById(id).orElse(null);
	}
}

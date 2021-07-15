package com.example.cubGetUserDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cubGetUserDetails.entity.Customer;
import com.example.cubGetUserDetails.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;
	@GetMapping("/customer/{id}")
	public Customer findCustomerById(@PathVariable int id) {
		return service.getCustomerById(id);
	}
}

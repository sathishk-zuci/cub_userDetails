package com.example.cubGetUserDetails.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Object> findCustomerById(@PathVariable int id) {
		Customer customer = service.getCustomerById(id);
		if(customer != null) {
			return new ResponseEntity<>(customer,HttpStatus.OK);
		}
		return new ResponseEntity<>("Resource not found id : "+id,HttpStatus.NOT_FOUND);
	}
}

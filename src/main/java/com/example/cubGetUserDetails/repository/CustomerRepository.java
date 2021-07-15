package com.example.cubGetUserDetails.repository;

import org.springframework.stereotype.Repository;

import com.example.cubGetUserDetails.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

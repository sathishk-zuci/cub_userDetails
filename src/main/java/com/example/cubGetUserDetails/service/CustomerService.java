package com.example.cubGetUserDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cubGetUserDetails.entity.Audit;
import com.example.cubGetUserDetails.entity.Customer;
import com.example.cubGetUserDetails.repository.AuditRepository;
import com.example.cubGetUserDetails.repository.CustomerRepository;


@Service
public class CustomerService {
	public String tableName;
	
	@Autowired(required=true)
	private CustomerRepository customerRepo;

	@Autowired(required=true)
	private AuditRepository auditRepo;
	
	public Customer getCustomerById(int id) {
		
		//for audit purpose before checking
		Audit audit = new Audit();
		audit.setCustomer_id(id);
		audit.setLastModifiedDate(java.time.LocalDateTime.now());
		auditRepo.save(audit);
	
		Customer customerObj =  customerRepo.findById(id).orElse(null);
		
		
		if(customerObj != null) {
		   customerAudit(id);
		   System.out.println("hello");
		}
		else {
			customerAudit(0);
		}
		
		return customerRepo.findById(id).orElse(null);
	}
	//for audit purpose after checking
	public void customerAudit(int id) {
		Audit audit = new Audit();
		audit.setCustomer_id(id);
		audit.setLastModifiedDate(java.time.LocalDateTime.now());
		auditRepo.save(audit);
	}
}

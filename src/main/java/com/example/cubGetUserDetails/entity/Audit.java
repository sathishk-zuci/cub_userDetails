package com.example.cubGetUserDetails.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "spw_audit")
public class Audit {
	
	@Id
	@GeneratedValue
	private int id;
	private int customer_id;
	private LocalDateTime last_access_time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public LocalDateTime getLastModifiedDate() {
		return last_access_time;
	}
	public void setLastModifiedDate(LocalDateTime last_access_time) {
		this.last_access_time = last_access_time;
	}
	

}

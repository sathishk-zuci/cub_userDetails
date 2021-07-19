package com.example.cubGetUserDetails.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "customer_details")

public class Customer {

	@Id
	@GeneratedValue
	private int id;
	private int customer_no;
	private String coded_accountno;
	private String score;
	private String prediction;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(int customer_no) {
		this.customer_no = customer_no;
	}
	public String getCoded_accountno() {
		return coded_accountno;
	}
	public void setCoded_accountno(String coded_accountno) {
		this.coded_accountno = coded_accountno;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getPrediction() {
		return prediction;
	}
	public void setPrediction(String prediction) {
		this.prediction = prediction;
	}
	

	
}

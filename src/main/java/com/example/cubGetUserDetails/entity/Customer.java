package com.example.cubGetUserDetails.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "cub_jewel_evaluvated")
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String coded_accountno;
	private String prediction;
	private String score;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoded_accountno() {
		return coded_accountno;
	}
	public void setCoded_accountno(String coded_accountno) {
		this.coded_accountno = coded_accountno;
	}
	public String getPrediction() {
		return prediction;
	}
	public void setPrediction(String prediction) {
		this.prediction = prediction;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
}

package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
@SecondaryTable(name="CUSTOMER_DETAIL")
public class Customer {
	private int customerId;
	private String customerName;
	
	private String customerAddress;
	private int creditScore;
	private int rewardPoints;
	
	@Id
	@GeneratedValue
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Column(table="CUSTOMER_DETAIL")
	public String getCustomerAddress() {
		return customerAddress;
	}
	
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	@Column(table="CUSTOMER_DETAIL")
	public int getCreditScore() {
		return creditScore;
	}
	
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
	@Column(table="CUSTOMER_DETAIL")
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	
}

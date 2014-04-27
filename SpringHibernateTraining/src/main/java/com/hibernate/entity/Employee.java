package com.hibernate.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="EMP")
public class Employee {
	private int empid;
	private String empName;
	private String empPassword;
	private String empEmailAddress;
	private boolean isPermanent;
	private Date empJoinDate;
	private Date empLoginTime;
	
	
	@Id
	@TableGenerator(name="empId", table="EMP_PK_TABLE", pkColumnName="EMP_KEY", pkColumnValue="EMP_VALUE",
	allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="empId")
	@Column(name="EMP_ID")
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Transient
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	
	@Column(nullable=false)
	public String getEmpEmailAddress() {
		return empEmailAddress;
	}
	public void setEmpEmailAddress(String empEmailAddress) {
		this.empEmailAddress = empEmailAddress;
	}
	
	@Basic
	public boolean isPermanent() {
		return isPermanent;
	}
	
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getEmpJoinDate() {
		return empJoinDate;
	}
	public void setEmpJoinDate(Date empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getEmpLoginTime() {
		return empLoginTime;
	}
	public void setEmpLoginTime(Date empLoginTime) {
		this.empLoginTime = empLoginTime;
	}
}

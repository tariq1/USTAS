package com.ustas.db.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LEAVE_MASTER")
public class LeaveInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="INDEX_NO")
	private int indexNo;
	
	@Column(name="LEAVE_TYPE")
	private String LeaveType;
	
	@Column(name="LEAVE_DESC")
	private String desc;
	  
	@Column(name="CF_ALLOWED")
	private boolean cfAllowed;
	
	@Column(name="IS_ACTIVE")
	private boolean isActive;

	public int getIndexNo() {
		return indexNo;
	}

	public void setIndexNo(int indexNo) {
		this.indexNo = indexNo;
	}

	public String getLeaveType() {
		return LeaveType;
	}

	public void setLeaveType(String leaveType) {
		LeaveType = leaveType;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isCfAllowed() {
		return cfAllowed;
	}

	public void setCfAllowed(boolean cfAllowed) {
		this.cfAllowed = cfAllowed;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

}

package com.project.HospitalManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ReportTb2")
public class Report {
	@Id
	private long rid;
	private String rDetails;
	private String rDate;
	private long did;
	private long pid;
	public long getRid() {
		return rid;
	}
	public void setRid(long rid) {
		this.rid = rid;
	}
	public String getrDetails() {
		return rDetails;
	}
	public void setrDetails(String rDetails) {
		this.rDetails = rDetails;
	}
	public String getrDate() {
		return rDate;
	}
	public void setrDate(String rDate) {
		this.rDate = rDate;
	}
	public long getDid() {
		return did;
	}
	public void setDid(long did) {
		this.did = did;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public Report(long rid, String rDetails, String rDate, long did, long pid) {
		super();
		this.rid = rid;
		this.rDetails = rDetails;
		this.rDate = rDate;
		this.did = did;
		this.pid = pid;
	}
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Report [rid=" + rid + ", rDetails=" + rDetails + ", rDate=" + rDate + ", did=" + did + ", pid=" + pid
				+ "]";
	}
	
	
	
	
}

package com.project.HospitalManagement.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="AppointmentTb2")
public class Appointment {
	@Id
	private long aid;
	private Date date;
	private long charge;
	public long getAid() {
		return aid;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getCharge() {
		return charge;
	}
	public void setCharge(long charge) {
		this.charge = charge;
	}
	public Appointment(long aid, Date date, long charge) {
		super();
		this.aid = aid;
		this.date = date;
		this.charge = charge;
	}
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Appointment [aid=" + aid + ", date=" + date + ", charge=" + charge + "]";
	}

	
}

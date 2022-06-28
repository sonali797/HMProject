package com.project.HospitalManagement.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="DoctorTb2")
public class Doctor {

	@Id
	
	private long did;
	private String firstName;
	private String lastName;
	private String department;
	private String gender;
	public long getDid() {
		return did;
	}
	public void setDid(long did) {
		this.did = did;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Doctor(long did, String firstName, String lastName, String department, String gender) {
		super();
		this.did = did;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.gender = gender;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", gender=" + gender + "]";
	}
	
	
	
	

}

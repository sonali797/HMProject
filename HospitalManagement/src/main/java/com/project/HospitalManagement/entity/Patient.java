package com.project.HospitalManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="PatientTb2")
public class Patient {
	
	@Id
	private long id;
	private String firstName;
	private String lastName;
	private long age;
	private String gender;
	private String email;
	private String contactNo;
	private String diseaseReason;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getDiseaseReason() {
		return diseaseReason;
	}
	public void setDiseaseReason(String diseaseReason) {
		this.diseaseReason = diseaseReason;
	}
	public Patient(long id, String firstName, String lastName, long age, String gender, String email, String contactNo,
			String diseaseReason) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.contactNo = contactNo;
		this.diseaseReason = diseaseReason;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", email=" + email + ", contactNo=" + contactNo + ", diseaseReason="
				+ diseaseReason + "]";
	}
	
	
	
}


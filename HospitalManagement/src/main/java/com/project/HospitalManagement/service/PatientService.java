package com.project.HospitalManagement.service;

import java.util.List;

import com.project.HospitalManagement.entity.Patient;

public interface PatientService {

	Patient savePatient(Patient patient);

	List<Patient> getPatientList();


	

	String deletePatient(long pid);


	Patient updatePatient(long id, Patient patient);

	Patient getPatientById(long id);


	

}

package com.project.HospitalManagement.service;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.project.HospitalManagement.entity.Doctor;

public interface DoctorService {

	Doctor saveDoctor(Doctor doctor);

	List<Doctor> getDoctorList();

	Doctor getDoctorById(long did);

	Doctor updateDoctor(long did, Doctor doctor);

	String deleteDoctor(long did);


}

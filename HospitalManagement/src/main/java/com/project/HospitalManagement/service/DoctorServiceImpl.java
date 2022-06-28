package com.project.HospitalManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HospitalManagement.entity.Doctor;
import com.project.HospitalManagement.entity.Patient;
import com.project.HospitalManagement.exception.GivenIdNotFoundException;
import com.project.HospitalManagement.exception.NoRecordFoundException;
import com.project.HospitalManagement.repository.DoctorRepository;

import exception.ResourceNotFoundException;

@Service
public class DoctorServiceImpl implements DoctorService {
	 @Autowired
	  DoctorRepository doctorRepository;

	@Override
	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> getDoctorList() {
		List<Doctor> doctors= doctorRepository.findAll();
		if(doctors.isEmpty())
			throw new NoRecordFoundException();
		else
			return doctors;
	}

	@Override
	public Doctor getDoctorById(long did) {
		Optional<Doctor> doctor = doctorRepository.findById(did);
		if(doctor.isPresent())
			return doctor.get();
		else
			throw new GivenIdNotFoundException();
	}

	@Override
	public Doctor updateDoctor(long did, Doctor doctor) {
		Doctor d=new Doctor();
		d = doctorRepository.findById(did).orElseThrow(
		     ()-> new ResourceNotFoundException("Doctor","Id",did));
		d.setFirstName(doctor.getFirstName());
		d.setLastName(doctor.getLastName());
		d.setGender(doctor.getGender());
		d.setDepartment(doctor.getDepartment());
		
		doctorRepository.save(d);
		return d;
	}

	@Override
	public String deleteDoctor(long did) {
		Doctor doctor=new Doctor();
		doctor = doctorRepository.findById(did).orElseThrow(
		     ()-> new ResourceNotFoundException("Doctor","Id",did));
		doctorRepository.deleteById(did);
		return "Record is deleted successfully";

	}
}

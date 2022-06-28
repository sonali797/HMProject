package com.project.HospitalManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HospitalManagement.entity.Patient;
import com.project.HospitalManagement.exception.GivenIdNotFoundException;
import com.project.HospitalManagement.exception.NoRecordFoundException;
import com.project.HospitalManagement.repository.PatientRepository;

import exception.ResourceNotFoundException;


	@Service
	public class PatientServiceImpl implements PatientService {

		  @Autowired
		  PatientRepository patientRepository;

		@Override
		public Patient savePatient(Patient patient) {
			return patientRepository.save(patient);
		}

		@Override
		public String deletePatient(long id) {
			Patient patient=new Patient();
			patient = patientRepository.findById(id).orElseThrow(
			     ()-> new ResourceNotFoundException("Patient","Id",id));
			patientRepository.deleteById(id);
			return "Record is deleted successfully";

		}

		@Override
		public Patient updatePatient(long id, Patient patient) {
			Patient p=new Patient();
			p = patientRepository.findById(id).orElseThrow(
			     ()-> new ResourceNotFoundException("Patient","Id",id));
			p.setFirstName(patient.getFirstName());
			p.setLastName(patient.getLastName());
			p.setGender(patient.getGender());
			p.setEmail(patient.getEmail());
			p.setContactNo(patient.getContactNo());
			p.setAge(patient.getAge());
			p.setEmail(patient.getEmail());
			p.setDiseaseReason(patient.getDiseaseReason());
			patientRepository.save(p);
			return p;
		}

		@Override
		public List<Patient> getPatientList() {
			List<Patient> patients= patientRepository.findAll();
			if(patients.isEmpty())
				throw new NoRecordFoundException();
			else
				return patients;
		}

		@Override
		public Patient getPatientById(long id) {
	Optional<Patient> patient = patientRepository.findById(id);
	if(patient.isPresent())
		return patient.get();
	else
		throw new GivenIdNotFoundException();
		}
		

}

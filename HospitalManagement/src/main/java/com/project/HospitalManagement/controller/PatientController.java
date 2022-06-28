package com.project.HospitalManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.HospitalManagement.entity.Patient;
import com.project.HospitalManagement.service.AppointmentService;
import com.project.HospitalManagement.service.PatientService;



@RestController
@RequestMapping("/api/patient")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping
	public ResponseEntity<Patient> savePatient(@RequestBody Patient patient) {
		return new ResponseEntity(patientService.savePatient(patient), HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public List<Patient> getPatientList(){
		return patientService.getPatientList();
		
	}
	
	@GetMapping("/{id}")
	public Patient getPatientById(@PathVariable("id")long id) {
		return patientService.getPatientById(id);
	}
	
	@PutMapping("/{id}")
	public Patient updatePatient(@PathVariable("id") long id , @RequestBody Patient patient) {
		return patientService.updatePatient(id,patient);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePatient(@PathVariable("id") long id) {
		return new ResponseEntity<String> (patientService.deletePatient(id), HttpStatus.OK);
	}

}

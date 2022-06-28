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

import com.project.HospitalManagement.entity.Doctor;
import com.project.HospitalManagement.service.DoctorService;


@RestController
@RequestMapping("/api/doctor")
public class DoctorController {


	@Autowired
	DoctorService doctorService;
	
	@PostMapping
	public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor doctor) {
		return new ResponseEntity(doctorService.saveDoctor(doctor), HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public List<Doctor> getDoctorList(){
		return doctorService.getDoctorList();
		
	}
	
	@GetMapping("/{id}")
	public Doctor getDoctorById(@PathVariable("id")long did) {
		return doctorService.getDoctorById(did);
	}
	
	@PutMapping("/{id}")
	public Doctor updateDoctor(@PathVariable("id") long did , @RequestBody Doctor doctor) {
		return doctorService.updateDoctor(did,doctor);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDoctor(@PathVariable("id") long did) {
		return new ResponseEntity<String> (doctorService.deleteDoctor(did), HttpStatus.OK);
	}

	
}

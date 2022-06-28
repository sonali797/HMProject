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

import com.project.HospitalManagement.entity.Appointment;
import com.project.HospitalManagement.service.AppointmentService;



@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping
	public ResponseEntity<Appointment> saveAppointment(@RequestBody Appointment appointment) {
		return new ResponseEntity(appointmentService.saveAppointment(appointment), HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public List<Appointment> getAppointmentList(){
		return appointmentService.getAppointmentList();
		
	}
	
	@GetMapping("/{id}")
	public Appointment getAppointmentById(@PathVariable("id")long aid) {
		return appointmentService.getAppointmentById(aid);
	}
	
	@PutMapping("/{id}")
	public Appointment updateAppointment(@PathVariable("id") long aid , @RequestBody Appointment appointment) {
		return appointmentService.updateAppointment(aid,appointment);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAppointment(@PathVariable("id") long aid) {
		return new ResponseEntity<String> (appointmentService.deleteAppointment(aid), HttpStatus.OK);
	}

}

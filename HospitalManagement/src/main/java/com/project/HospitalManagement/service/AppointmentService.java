package com.project.HospitalManagement.service;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.project.HospitalManagement.entity.Appointment;

public interface AppointmentService {

	Appointment saveAppointment(Appointment appointment);

	List<Appointment> getAppointmentList();

	Appointment getAppointmentById(long aid);

	Appointment updateAppointment(long aid, Appointment appointment);

	String deleteAppointment(long aid);

	
}

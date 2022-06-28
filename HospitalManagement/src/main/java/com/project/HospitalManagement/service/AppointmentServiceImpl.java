package com.project.HospitalManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HospitalManagement.entity.Appointment;
import com.project.HospitalManagement.exception.GivenIdNotFoundException;
import com.project.HospitalManagement.exception.NoRecordFoundException;
import com.project.HospitalManagement.repository.AppointmentRepository;

import exception.ResourceNotFoundException;


@Service
public class AppointmentServiceImpl implements AppointmentService {
	 @Autowired
	 AppointmentRepository appointmentRepository;

	@Override
	public Appointment saveAppointment(Appointment appointment) {
		return appointmentRepository.save(appointment);

	}

	@Override
	public List<Appointment> getAppointmentList() {
		List<Appointment> appointments=appointmentRepository.findAll();
		if(appointments.isEmpty())
			throw new NoRecordFoundException();
		else
			return appointments;

	}

	@Override
	public Appointment getAppointmentById(long aid) {
		Optional<Appointment> appointment = appointmentRepository.findById(aid);
		if(appointment.isPresent())
			return appointment.get();
		else
			throw new GivenIdNotFoundException();
	}

	@Override
	public Appointment updateAppointment(long aid, Appointment appointment) {
		Appointment a=new Appointment();
		a = appointmentRepository.findById(aid).orElseThrow(
			     ()-> new ResourceNotFoundException("AppointmentPatient","Id",aid));
		a.setDate(appointment.getDate());
		a.setCharge(appointment.getCharge());
		appointmentRepository.save(a);
		return a;
	}

	@Override
	public String deleteAppointment(long aid) {
		Appointment appointment=new Appointment();
		appointment = appointmentRepository.findById(aid).orElseThrow(
			     ()-> new ResourceNotFoundException("AppointmentPatient","Id",aid));
		appointmentRepository.deleteById(aid);
		return "Record is deleted successfully";
	}

}






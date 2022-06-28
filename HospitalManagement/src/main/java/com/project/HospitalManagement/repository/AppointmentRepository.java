package com.project.HospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HospitalManagement.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

}

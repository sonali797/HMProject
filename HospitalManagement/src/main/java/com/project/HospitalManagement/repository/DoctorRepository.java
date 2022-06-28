package com.project.HospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HospitalManagement.entity.Doctor;

public interface DoctorRepository  extends JpaRepository<Doctor, Long> {

}

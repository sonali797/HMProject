package com.project.HospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HospitalManagement.entity.Patient;



public interface PatientRepository  extends JpaRepository<Patient, Long>  {

}

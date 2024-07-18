package com.innovation.OPD_Project.Repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovation.OPD_Project.model.Patient;

@Repository
@Qualifier("patientRepo")
public interface PatientRepository extends JpaRepository<Patient, Long>{
Patient findByEmailAndPassword(String email,String password);
}

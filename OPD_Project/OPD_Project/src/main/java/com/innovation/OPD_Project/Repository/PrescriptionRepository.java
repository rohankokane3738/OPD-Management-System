package com.innovation.OPD_Project.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovation.OPD_Project.model.Prescription;

@Repository
@Qualifier("presRepo")
public interface PrescriptionRepository  extends JpaRepository<Prescription, Long>{
	List<Prescription> findAllByAid(long aid);
}

package com.innovation.OPD_Project.Repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovation.OPD_Project.model.CasePaper;

@Repository
@Qualifier("caseRepo")
public interface CasePaperRepository extends JpaRepository<CasePaper, Long> {

}

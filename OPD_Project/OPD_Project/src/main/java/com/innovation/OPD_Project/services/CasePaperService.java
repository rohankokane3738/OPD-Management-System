package com.innovation.OPD_Project.services;

import java.util.List;

import com.innovation.OPD_Project.model.CasePaper;

public interface CasePaperService {
	CasePaper insert(CasePaper cp);
	void delete(long cid);
	CasePaper update(long cid,CasePaper cp);
	CasePaper search(long cid);
	List<CasePaper> getAll();
}

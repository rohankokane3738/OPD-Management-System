package com.innovation.OPD_Project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.OPD_Project.Repository.CasePaperRepository;
import com.innovation.OPD_Project.model.Appointment;
import com.innovation.OPD_Project.model.CasePaper;

@Service
public class CasePaperServiceImpl implements CasePaperService {
	@Autowired
	@Qualifier("caseRepo")
	CasePaperRepository caseRepo;
	@Override
	public CasePaper insert(CasePaper cp) {
		// TODO Auto-generated method stub
		return caseRepo.save(cp) ;
	}

	@Override
	public void delete(long cid) {
		// TODO Auto-generated method stub
		caseRepo.deleteById(cid);
	}

	@Override
	public CasePaper update(long cid, CasePaper cp) {
		Optional<CasePaper> opt=caseRepo.findById(cid);
		if(opt.isPresent())
		{
			CasePaper cpp=opt.get();
			cpp.setPid(cp.getPid());
			cpp.setAid(cp.getAid());
			cpp.setDt(cp.getDt());
			cpp.setComplain(cp.getComplain());
			cpp.setBp(cp.getBp());
			cpp.setSugar(cp.getSugar());
			cpp.setSpo(cp.getSpo());
			
		return caseRepo.save(cpp);
		}
		return null;
	}

	@Override
	public CasePaper search(long cid) {
		Optional<CasePaper> opt=caseRepo.findById(cid);
		if(opt.isPresent())
		{
			CasePaper cpp=opt.get();
			
		return cpp;
		}
		return null;
	}

	@Override
	public List<CasePaper> getAll() {
		// TODO Auto-generated method stub
		return caseRepo.findAll();
	}

}

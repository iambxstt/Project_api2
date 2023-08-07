package com.it.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.entity.ReturndressgownEntity;
import com.it.model.ReturndressgownRequestModel;
import com.it.model.ReturndressgownResponeModel;
import com.it.repository.ReturndressgownRepository;

@Service
public class ReturndressgownService {
	@Autowired
	private ReturndressgownRepository returndressgownrepository;
	
	public List<ReturndressgownResponeModel> getReturndressgownAll(){
		List<ReturndressgownEntity> rtdList = returndressgownrepository.findAll();
		List<ReturndressgownResponeModel> rtdRespone = null;
		if(rtdList != null) {
			rtdRespone = new ArrayList<>();
			for (ReturndressgownEntity rtdjb : rtdList) {
				ReturndressgownResponeModel rtdres = new ReturndressgownResponeModel();
				rtdres.setRdId(rtdjb.getRdId());
				rtdres.setRdDate(rtdjb.getRdDate());
				rtdres.setCtmId(rtdjb.getCtmId());
				rtdres.setGownId(rtdjb.getGownId());
				
				rtdRespone.add(rtdres);
				}
			}
			return rtdRespone;
	}
	public ReturndressgownResponeModel getById(Integer RdId) {
		Optional<ReturndressgownEntity> rtdtity = returndressgownrepository.findById(RdId);
        ReturndressgownResponeModel rtg = null;
        if(rtdtity.isPresent()) {
        	ReturndressgownEntity dn = rtdtity.get();
            rtg = new ReturndressgownResponeModel();
            rtg.setRdId(dn.getRdId());
            rtg.setRdDate(dn.getRdDate());
            rtg.setCtmId(dn.getCtmId());
            rtg.setGownId(dn.getGownId());
        	}
        return rtg;
		}
	public void seve(ReturndressgownRequestModel request) {
		if (request != null) {
			ReturndressgownEntity rts = new ReturndressgownEntity();
			rts.setRdId(request.getRdId());
			rts.setRdDate(request.getRdDate());
			rts.setCtmId(request.getCtmId());
			rts.setGownId(request.getGownId());
			
			returndressgownrepository.save(rts);
		}
	}
	public void update(ReturndressgownRequestModel request,Integer RdId) {
		Optional<ReturndressgownEntity> rts = returndressgownrepository.findById(RdId);
    	if (rts.isPresent()) {
    		ReturndressgownEntity uprtg = rts.get();
        if (request != null) {
        	uprtg.setRdId(request.getRdId());
        	uprtg.setRdDate(request.getRdDate());
        	uprtg.setCtmId(request.getCtmId());
        	uprtg.setGownId(request.getGownId());
        }
        returndressgownrepository.save(uprtg);
    	}
	}
	public void deleteById(Integer RdId) {
		returndressgownrepository.deleteById(RdId);
	}
}

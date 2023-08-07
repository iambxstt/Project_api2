package com.it.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.entity.RentEntity;
import com.it.model.RentRequestModel;
import com.it.model.RentResponeModel;
import com.it.repository.RentRepository;

@Service
public class RentService {
	@Autowired
	private RentRepository rentrepository;
	
	public List<RentResponeModel> getRentAll(){
		List<RentEntity> renList = rentrepository.findAll();
		List<RentResponeModel> renRespone = null;
		if (renList != null) {
			renRespone = new ArrayList<>();
			for (RentEntity renjb : renList) {
				RentResponeModel renres = new RentResponeModel();
				renres.setReId(renjb.getReId());
				renres.setReDate(renjb.getReDate());
				renres.setReNumber(renjb.getReNumber());
				renres.setReInsurance(renjb.getReInsurance());
				renres.setReStatusPm(renjb.getReStatusPm());
				renres.setReSlipPm(renjb.getReSlipPm());
				renres.setReFormGown(renjb.getReFormGown());
				renres.setCtmId(renjb.getCtmId());
				renres.setGownId(renjb.getGownId());
				
				renRespone.add(renres);
			}
		}
		return renRespone;
	}
	public RentResponeModel getById(Integer ReId) {
		Optional<RentEntity> rentity = rentrepository.findById(ReId);
        RentResponeModel rer = null;
        if(rentity.isPresent()) {
        	RentEntity en = rentity.get();
        	rer = new RentResponeModel();
        	rer.setReId(en.getReId());
        	rer.setReDate(en.getReDate());
        	rer.setReNumber(en.getReNumber());
        	rer.setReInsurance(en.getReInsurance());
        	rer.setReStatusPm(en.getReStatusPm());
        	rer.setReSlipPm(en.getReSlipPm());
        	rer.setReFormGown(en.getReFormGown());
        	rer.setCtmId(en.getCtmId());
        	rer.setGownId(en.getGownId());
        }
        return rer;
	}
	public void seve(RentRequestModel request) {
		if (request != null) {
			RentEntity rs = new RentEntity();
			rs.setReId(request.getReId());
			rs.setReDate(request.getReDate());
			rs.setReNumber(request.getReNumber());
			rs.setReInsurance(request.getReInsurance());
			rs.setReStatusPm(request.getReStatusPm());
			rs.setReSlipPm(request.getReSlipPm());
			rs.setReFormGown(request.getReFormGown());
			rs.setCtmId(request.getCtmId());
			rs.setGownId(request.getGownId());
			
			rentrepository.save(rs);
		}
	}
	public void update(RentRequestModel request,Integer ReId) {
		Optional<RentEntity> rs = rentrepository.findById(ReId);
    	if (rs.isPresent()) {
    		RentEntity uprent = rs.get();
        if (request != null) {
        	uprent.setReId(request.getReId());
        	uprent.setReDate(request.getReDate());
        	uprent.setReNumber(request.getReNumber());
        	uprent.setReInsurance(request.getReInsurance());
        	uprent.setReStatusPm(request.getReStatusPm());
        	uprent.setReSlipPm(request.getReSlipPm());
        	uprent.setReFormGown(request.getReFormGown());
        	uprent.setCtmId(request.getCtmId());
        	uprent.setGownId(request.getGownId());
        }
        rentrepository.save(uprent);
    	}
	}
	public void deleteById(Integer ReId) {
		rentrepository.deleteById(ReId);
	}
}

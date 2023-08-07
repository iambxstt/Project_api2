package com.it.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.entity.GownEntity;
import com.it.model.GownRequestModel;
import com.it.model.GownResponeModel;
import com.it.repository.GownRepository;

@Service
public class GownService {
	@Autowired
	private GownRepository gownrepository;
	
	public List<GownResponeModel> getGownAll() {
		List<GownEntity> gowList = gownrepository.findAll();
		List<GownResponeModel> gowRepone = null;
		if(gowList != null) {
			gowRepone = new ArrayList<>();
			for (GownEntity gowjb : gowList) {
				GownResponeModel gowres = new GownResponeModel();
				gowres.setGownId(gowjb.getGownId());
				gowres.setGownName(gowjb.getGownName());
				gowres.setGownImg(gowjb.getGownImg());
				gowres.setGownLevel(gowjb.getGownLevel());
				gowres.setGownDetails(gowjb.getGownDetails());
				gowres.setRoleId(gowjb.getRoleId());
				
				gowRepone.add(gowres);
			}
		}
		return gowRepone;
	}
	public GownResponeModel getById(Integer GownId) {
		Optional<GownEntity> gowtity = gownrepository.findById(GownId);
		GownResponeModel gwn = null;
		if (gowtity.isPresent()) {
			GownEntity ge = gowtity.get();
			gwn = new GownResponeModel();
			gwn.setGownId(ge.getGownId());
			gwn.setGownName(ge.getGownName());
			gwn.setGownImg(ge.getGownImg());
			gwn.setGownLevel(ge.getGownLevel());
			gwn.setGownDetails(ge.getGownDetails());
			gwn.setRoleId(ge.getRoleId());
		}
		return gwn;
	}
	public void seve(GownRequestModel request) {
		if (request != null) {
		GownEntity gs = new GownEntity();
		gs.setGownId(request.getGownId());
		gs.setGownName(request.getGownName());
		gs.setGownImg(request.getGownImg());
		gs.setGownLevel(request.getGownLevel());
		gs.setGownDetails(request.getGownDetails());
		gs.setRoleId(request.getRoleId());
		gownrepository.save(gs);
		}
	}
	public void update(GownRequestModel request,Integer GownId) {
		Optional<GownEntity> gs = gownrepository.findById(GownId);
		if(gs.isPresent()) {
			GownEntity upgow = gs.get();
		if(request != null) {
			upgow.setGownId(request.getGownId());
			upgow.setGownName(request.getGownName());
			upgow.setGownImg(request.getGownImg());
			upgow.setGownLevel(request.getGownLevel());
			upgow.setGownDetails(request.getGownDetails());
			upgow.setRoleId(request.getRoleId());
		}
		gownrepository.save(upgow);
		}
	}
	public void deleteById(Integer GownId) {
	    gownrepository.deleteById(GownId);
	    }
}



package com.it.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.entity.RoleEntity;
import com.it.model.RoleRequestModel;
import com.it.model.RoleResponeModel;
import com.it.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	private RoleRepository rolerepository;
	
	public List<RoleResponeModel> getRoleAll(){
		List<RoleEntity> rolList = rolerepository.findAll();
		List<RoleResponeModel> rolRespone = null;
		if(rolList != null) {
			rolRespone = new ArrayList<>();
			for (RoleEntity roljb : rolList) {
				RoleResponeModel rolres = new RoleResponeModel();
				rolres.setRoleId(roljb.getRoleId());
				rolres.setRoleName(roljb.getRoleName());
				rolres.setRoleStetus(roljb.getRoleStetus());
				
				rolRespone.add(rolres);
				}	
			}
			return rolRespone;
	}
	public RoleResponeModel getById(Integer RoleId) {
		Optional<RoleEntity> roltity = rolerepository.findById(RoleId);
        RoleResponeModel ros = null;
        if(roltity.isPresent()) {
        	RoleEntity ln = roltity.get();
            ros = new RoleResponeModel();
            ros.setRoleId(ln.getRoleId());
            ros.setRoleName(ln.getRoleName());
            ros.setRoleStetus(ln.getRoleStetus());
        	}
			return ros;
		}
	public void seve(RoleRequestModel request) {
		if (request != null) {
			RoleEntity ls = new RoleEntity();
			ls.setRoleName(request.getRoleName());
			ls.setRoleStetus(request.getRoleStetus());
			
			rolerepository.save(ls);
		}
	}
	public void update(RoleRequestModel request,Integer RoleId) {
		Optional<RoleEntity> ls = rolerepository.findById(RoleId);
    	if (ls.isPresent()) {
    		RoleEntity uprol = ls.get();
        if (request != null) {
        	uprol.setRoleId(request.getRoleId());
        	uprol.setRoleName(request.getRoleName());
        	uprol.setRoleStetus(request.getRoleStetus());
        }
        rolerepository.save(uprol);
    	}
	}
	public void deleteById(Integer RoleId) {
    	rolerepository.deleteById(RoleId);
    }
}

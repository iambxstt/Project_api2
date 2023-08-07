package com.it.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.entity.CustmersEntity;
import com.it.model.CustmersRequestModel;
import com.it.model.CustmersResponeModel;
import com.it.repository.CustmersRepository;

@Service
public class CustmersService {
	@Autowired
	private CustmersRepository custmersrepository;
	
	public List<CustmersResponeModel> getCustmersAll(){
	List<CustmersEntity> ctmList = custmersrepository.findAll();
	List<CustmersResponeModel> ctmRespone = null;
	if(ctmList != null) {
		ctmRespone = new ArrayList<>();
		for (CustmersEntity ctmjb : ctmList) {
			CustmersResponeModel ctmres = new CustmersResponeModel();
			ctmres.setCtmId(ctmjb.getCtmId());
			ctmres.setCtmUser(ctmjb.getCtmUser());
			ctmres.setCtmPassword(ctmjb.getCtmPassword());
			ctmres.setCtmTitle(ctmjb.getCtmTitle());
			ctmres.setCtmFirstname(ctmjb.getCtmFirstname());
			ctmres.setCtmLastname(ctmjb.getCtmLastname());
			ctmres.setCtmGender(ctmjb.getCtmGender());
			ctmres.setCtmBirth(ctmjb.getCtmBirth());
			ctmres.setCtmPhon(ctmjb.getCtmPhon());
			ctmres.setCtmEmail(ctmjb.getCtmEmail());
			ctmres.setCtmAddrss(ctmjb.getCtmAddrss());
			ctmres.setCtmUniversity(ctmjb.getCtmUniversity());
			ctmres.setCtmFaculty(ctmjb.getCtmFaculty());
			ctmres.setCtmMajor(ctmjb.getCtmMajor());
			ctmres.setCtmWeight(ctmjb.getCtmWeight());
			ctmres.setCtmHeight(ctmjb.getCtmHeight());
			ctmres.setCtmStatus(ctmjb.getCtmStatus());
			ctmres.setZipCode(ctmjb.getZipCode());
			ctmres.setRoleId(ctmjb.getRoleId());
			
			ctmRespone.add(ctmres);
			}
		}
		return ctmRespone;
	}
	public CustmersResponeModel getById(Integer CtmId) {
        Optional<CustmersEntity> ctmtity = custmersrepository.findById(CtmId);
        CustmersResponeModel cus = null;
        
        if(ctmtity.isPresent()) {
        	CustmersEntity en = ctmtity.get();
            cus = new CustmersResponeModel();
            cus.setCtmId(en.getCtmId());
            cus.setCtmUser(en.getCtmUser());
            cus.setCtmPassword(en.getCtmPassword());
            cus.setCtmTitle(en.getCtmTitle());
            cus.setCtmFirstname(en.getCtmFirstname());
            cus.setCtmLastname(en.getCtmLastname());
            cus.setCtmGender(en.getCtmGender());
            cus.setCtmBirth(en.getCtmBirth());
            cus.setCtmPhon(en.getCtmPhon());
            cus.setCtmEmail(en.getCtmEmail());
            cus.setCtmAddrss(en.getCtmAddrss());
            cus.setCtmUniversity(en.getCtmUniversity());
            cus.setCtmFaculty(en.getCtmFaculty());
            cus.setCtmMajor(en.getCtmMajor());
            cus.setCtmWeight(en.getCtmWeight());
            cus.setCtmHeight(en.getCtmHeight());
            cus.setCtmStatus(en.getCtmStatus());
            cus.setZipCode(en.getZipCode());
            cus.setRoleId(en.getRoleId());

        	}
        return cus;
		}
	public void seve(CustmersRequestModel request) {
		if (request != null) {
			CustmersEntity cs = new CustmersEntity();
			cs.setCtmId(request.getCtmId());
			cs.setCtmUser(request.getCtmUser());
            cs.setCtmPassword(request.getCtmPassword());
            cs.setCtmTitle(request.getCtmTitle());
            cs.setCtmFirstname(request.getCtmFirstname());
            cs.setCtmLastname(request.getCtmLastname());
            cs.setCtmGender(request.getCtmGender());
            cs.setCtmBirth(request.getCtmBirth());
            cs.setCtmPhon(request.getCtmPhon());
            cs.setCtmEmail(request.getCtmEmail());
            cs.setCtmAddrss(request.getCtmAddrss());
            cs.setCtmUniversity(request.getCtmUniversity());
            cs.setCtmFaculty(request.getCtmFaculty());
            cs.setCtmMajor(request.getCtmMajor());
            cs.setCtmWeight(request.getCtmWeight());
            cs.setCtmHeight(request.getCtmHeight());
            cs.setCtmStatus(request.getCtmStatus());
            cs.setZipCode(request.getZipCode());
            cs.setRoleId(request.getRoleId());
            
            custmersrepository.save(cs);
		}
	}
    public void update(CustmersRequestModel request,Integer CtmId) {
    	Optional<CustmersEntity> cs = custmersrepository.findById(CtmId);
    	if (cs.isPresent()) {
    		CustmersEntity upctm = cs.get();
    	if (request != null) {
    		upctm.setCtmUser(request.getCtmUser());
    		upctm.setCtmPassword(request.getCtmPassword());
    		upctm.setCtmTitle(request.getCtmTitle());
    		upctm.setCtmFirstname(request.getCtmFirstname());
    		upctm.setCtmLastname(request.getCtmLastname());
    		upctm.setCtmGender(request.getCtmGender());
    		upctm.setCtmBirth(request.getCtmBirth());
    		upctm.setCtmPhon(request.getCtmPhon());
    		upctm.setCtmEmail(request.getCtmEmail());
    		upctm.setCtmAddrss(request.getCtmAddrss());
    		upctm.setCtmUniversity(request.getCtmUniversity());
    		upctm.setCtmFaculty(request.getCtmFaculty());
    		upctm.setCtmMajor(request.getCtmMajor());
    		upctm.setCtmWeight(request.getCtmWeight());
    		upctm.setCtmHeight(request.getCtmHeight());
    		upctm.setCtmStatus(request.getCtmStatus());
    		upctm.setZipCode(request.getZipCode());
    		upctm.setRoleId(request.getRoleId());
    	}
    	custmersrepository.save(upctm);
    	}
    }
    public void deleteById(Integer CtmId) {
    	custmersrepository.deleteById(CtmId);
    }
	}
	

package com.it.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.entity.CustmersEntity;
import com.it.model.CustmersResponeModel;
import com.it.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	
	private LoginRepository loginRepo;
	@Autowired
	private ModelMapper mm;
	public CustmersResponeModel login(String ctmuser,String ctmpassword) {
		CustmersEntity ctm = loginRepo.login(ctmuser,ctmpassword);
		if (ctm != null) {
			return mm.map(ctm, new TypeToken<CustmersResponeModel>() {
			}.getType());
		}
		return null;
	}
}

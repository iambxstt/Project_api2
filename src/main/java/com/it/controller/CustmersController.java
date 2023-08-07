package com.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.model.CustmersRequestModel;
import com.it.model.CustmersResponeModel;
import com.it.service.CustmersService;


@RestController
public class CustmersController {
	@Autowired
	private CustmersService custmersservice;
	@GetMapping("/Custmers")
	public List<CustmersResponeModel> getCustmersAll(){
		return custmersservice.getCustmersAll();
	}
	@GetMapping("/Custmers/{ctmId}")
	public CustmersResponeModel getById(@PathVariable Integer ctmId) {
		return custmersservice.getById(ctmId);
	}
	@PutMapping("/Custmers/{ctmId}")
	public void update(@RequestBody CustmersRequestModel request,@PathVariable Integer ctmId) {
		custmersservice.update(request, ctmId);
	}
	@PostMapping("/Custmers")
	public void save(@RequestBody CustmersRequestModel request) {
		custmersservice.seve(request);
	}
	@DeleteMapping("/Custmers/{ctmId}")
	public void deleteById(@PathVariable Integer ctmId) {
		custmersservice.deleteById(ctmId);
	}
}

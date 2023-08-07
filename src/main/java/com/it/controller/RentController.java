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

import com.it.model.RentRequestModel;
import com.it.model.RentResponeModel;
import com.it.service.RentService;



@RestController
public class RentController {
	@Autowired
	private RentService rentservice;
	@GetMapping("/Rent")
	public List<RentResponeModel> getRentAll(){
		return rentservice.getRentAll();
	}
	@GetMapping("/Rent/{reId}")
	public RentResponeModel getById(@PathVariable Integer reId) {
		return rentservice.getById(reId);
	}
	@PutMapping("/Rent/{reId}")
	public void update(@RequestBody RentRequestModel request,@PathVariable Integer reId) {
		rentservice.update(request, reId);
	}
	@PostMapping("/Rent")
	public void save(@RequestBody RentRequestModel request) {
		rentservice.seve(request);
	}
	@DeleteMapping("/Rent/{reId}")
	public void deleteById(@PathVariable Integer reId) {
		rentservice.deleteById(reId);
	}
}

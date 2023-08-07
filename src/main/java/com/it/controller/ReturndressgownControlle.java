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

import com.it.model.ReturndressgownRequestModel;
import com.it.model.ReturndressgownResponeModel;
import com.it.service.ReturndressgownService;



@RestController
public class ReturndressgownControlle {
	@Autowired
	private ReturndressgownService returndressgownservice;
	@GetMapping("/Returndressgown")
	public List<ReturndressgownResponeModel> getReturndressgownAll(){
		return returndressgownservice.getReturndressgownAll();
	}
	@GetMapping("/Returndressgown/{rdId}")
	public ReturndressgownResponeModel getById(@PathVariable Integer rdId) {
		return returndressgownservice.getById(rdId);
	}
	@PutMapping("/Returndressgown/{rdId}")
	public void update(@RequestBody ReturndressgownRequestModel request,@PathVariable Integer rdId) {
		returndressgownservice.update(request, rdId);
	}
	@PostMapping("/Returndressgown")
	public void save(@RequestBody ReturndressgownRequestModel request) {
		returndressgownservice.seve(request);
	}
	@DeleteMapping("/Returndressgown/{rdId}")
	public void deleteById(@PathVariable Integer rdId) {
		returndressgownservice.deleteById(rdId);
	}
}

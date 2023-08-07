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

import com.it.model.GownRequestModel;
import com.it.model.GownResponeModel;
import com.it.service.GownService;



@RestController
public class GownController {
	@Autowired
	private GownService gownservice;
	@GetMapping("/Gown")
	public List<GownResponeModel> getGownAll(){
		return gownservice.getGownAll();
	}
	@GetMapping("/Gown/{gownId}")
	public GownResponeModel getById(@PathVariable Integer gownId) {
		return gownservice.getById(gownId);
	}
	@PutMapping("/Gown/{gownId}")
	public void update(@RequestBody GownRequestModel request,@PathVariable Integer gownId) {
		gownservice.update(request, gownId);
	}
	@PostMapping("/Gown")
	public void save(@RequestBody GownRequestModel request) {
		gownservice.seve(request);
	}
	@DeleteMapping("/Gown/{gownId}")
	public void deleteById(@PathVariable Integer gownId) {
		gownservice.deleteById(gownId);
	}
}

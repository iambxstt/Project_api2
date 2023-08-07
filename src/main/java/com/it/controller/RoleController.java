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

import com.it.model.RoleRequestModel;
import com.it.model.RoleResponeModel;
import com.it.service.RoleService;



@RestController
public class RoleController {
	@Autowired
	private RoleService roleservice;
	@GetMapping("/Role")
	public List<RoleResponeModel> getRoleAll(){
		return roleservice.getRoleAll();
	}
	@GetMapping("/Role/{roleId}")
	public RoleResponeModel getById(@PathVariable Integer roleId) {
		return roleservice.getById(roleId);
	}
	@PutMapping("/Role/{roleId}")
	public void update(@RequestBody RoleRequestModel request,@PathVariable Integer roleId) {
		roleservice.update(request, roleId);
	}
	@PostMapping("/Role")
	public void save(@RequestBody RoleRequestModel request) {
		roleservice.seve(request);
	}
	@DeleteMapping("/Role/{roleId}")
	public void deleteById(@PathVariable Integer roleId) {
		roleservice.deleteById(roleId);
	}
}

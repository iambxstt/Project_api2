package com.it.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.it.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	@PostMapping("/{ctmUser}/{ctmPassword}")
	
	public ResponseEntity<Object> login(@PathVariable(name = "ctmUser") String ctmUser,@PathVariable(name ="ctmPassword") String ctmPassword){
		return ResponseEntity.ok(loginService.login(ctmUser, ctmPassword));
	}
}

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

import com.it.model.OrderdetailsRequestModel;
import com.it.model.OrderdetailsResponeModel;
import com.it.service.OrderdetailsService;



@RestController
public class OrderdetailsController {
	@Autowired
	private OrderdetailsService orderdetailsservice;
	@GetMapping("/Orderdetails")
	public List<OrderdetailsResponeModel> getOrderdetailsAll(){
		return orderdetailsservice.getOrderdetailsAll();
	}
	@GetMapping("/Orderdetails/{orderId}")
	public OrderdetailsResponeModel getById(@PathVariable Integer orderId) {
		return orderdetailsservice.getById(orderId);
	}
	@PutMapping("/Orderdetails/{orderId}")
	public void update(@RequestBody OrderdetailsRequestModel request,@PathVariable Integer orderId) {
		orderdetailsservice.update(request, orderId);
	}
	@PostMapping("/Orderdetails")
	public void save(@RequestBody OrderdetailsRequestModel request) {
		orderdetailsservice.seve(request);
	}
	@DeleteMapping("/Orderdetails/{orderId}")
	public void deleteById(@PathVariable Integer orderId) {
		orderdetailsservice.deleteById(orderId);
	}
}

package com.it.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.entity.OrderdetailsEntity;
import com.it.model.OrderdetailsRequestModel;
import com.it.model.OrderdetailsResponeModel;
import com.it.repository.OrderdetailsRepository;

@Service
public class OrderdetailsService {
	@Autowired
	private OrderdetailsRepository orderdetailsrepository;
	
	public List<OrderdetailsResponeModel> getOrderdetailsAll(){
		List<OrderdetailsEntity> orderList = orderdetailsrepository.findAll();
		List<OrderdetailsResponeModel> orderRespone = null;
		if (orderList != null) {
			orderRespone = new ArrayList<>();
			for (OrderdetailsEntity orderjb : orderList) {
				OrderdetailsResponeModel orderres = new OrderdetailsResponeModel();
				orderres.setOrderId(orderjb.getOrderId());
				orderres.setOrderNumber(orderjb.getOrderNumber());
				orderres.setOrderTotal(orderjb.getOrderTotal());
				orderres.setParcelNumber(orderjb.getParcelNumber());
				orderres.setStatus(orderjb.getStatus());
				orderres.setShippingCosts(orderjb.getShippingCosts());
				orderres.setReId(orderjb.getReId());
				orderres.setCtmId(orderjb.getCtmId());
				
				orderRespone.add(orderres);
			}
		}
		return orderRespone;
	}
	public OrderdetailsResponeModel getById (Integer OrderId) {
		Optional<OrderdetailsEntity> ordertity = orderdetailsrepository.findById(OrderId);
		OrderdetailsResponeModel ord = null;
		if (ordertity.isPresent()) {
			OrderdetailsEntity oe = ordertity.get();
			ord = new OrderdetailsResponeModel();
			ord.setOrderId(oe.getOrderId());
			ord.setOrderNumber(oe.getOrderNumber());
			ord.setOrderTotal(oe.getOrderTotal());
			ord.setParcelNumber(oe.getParcelNumber());
			ord.setStatus(oe.getStatus());
			ord.setShippingCosts(oe.getShippingCosts());
			ord.setReId(oe.getReId());
			ord.setCtmId(oe.getCtmId());
		}
		return ord;
	}
	public void seve(OrderdetailsRequestModel request) {
		if (request != null) {
			OrderdetailsEntity os = new OrderdetailsEntity();
			os.setOrderId(request.getOrderId());
			os.setOrderNumber(request.getOrderNumber());
			os.setOrderTotal(request.getOrderTotal());
			os.setParcelNumber(request.getParcelNumber());
			os.setStatus(request.getStatus());
			os.setShippingCosts(request.getShippingCosts());
			os.setReId(request.getReId());
			os.setCtmId(request.getCtmId());
			orderdetailsrepository.save(os);
		}
	}
	public void update(OrderdetailsRequestModel request,Integer OrderId) {
		Optional<OrderdetailsEntity> os = orderdetailsrepository.findById(OrderId);
		if (os.isPresent()) {
			OrderdetailsEntity uporder = os.get();
		if (request != null) {
			uporder.setOrderId(request.getOrderId());
			uporder.setOrderNumber(request.getOrderNumber());
			uporder.setOrderTotal(request.getOrderTotal());
			uporder.setParcelNumber(request.getParcelNumber());
			uporder.setStatus(request.getStatus());
			uporder.setShippingCosts(request.getShippingCosts());
			uporder.setReId(request.getReId());
			uporder.setCtmId(request.getCtmId());
		}
		orderdetailsrepository.save(uporder);
		}
		
	}
	public void deleteById(Integer OrderId) {
		orderdetailsrepository.deleteById(OrderId);
	}
}

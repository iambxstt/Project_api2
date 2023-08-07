package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.OrderdetailsEntity;

@Repository
public interface OrderdetailsRepository extends JpaRepository<OrderdetailsEntity, Integer>{

}

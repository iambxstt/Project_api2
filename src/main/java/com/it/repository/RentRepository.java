package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.RentEntity;

@Repository
public interface RentRepository extends JpaRepository<RentEntity, Integer>{

}

package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.ReturndressgownEntity;

@Repository
public interface ReturndressgownRepository extends JpaRepository<ReturndressgownEntity, Integer>{

}

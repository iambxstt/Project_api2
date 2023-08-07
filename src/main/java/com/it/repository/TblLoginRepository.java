package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.TblLoginEntity;

@Repository
public interface TblLoginRepository extends JpaRepository<TblLoginEntity, Integer>{

}

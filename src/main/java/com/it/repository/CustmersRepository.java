package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.CustmersEntity;

@Repository
public interface CustmersRepository extends JpaRepository<CustmersEntity, Integer> {

}

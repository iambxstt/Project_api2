package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.it.entity.CustmersEntity;

@Repository
public interface LoginRepository extends JpaRepository<CustmersEntity, Integer>{
	@Query("select t from CustmersEntity t where t.ctmUser =?1 and t.ctmPassword =?2")
	public CustmersEntity login(String ctmUser,String ctmPassword);
}

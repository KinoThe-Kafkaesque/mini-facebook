package com.example.stock.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.stock.bean.Status;

@Repository
public interface StatusDao extends JpaRepository<Status, Long> {
	
	public Status findByCode(String code);
	
	public List<Status> findByLoginUserSourceString(String loginUserSourceString);
	
}

package com.example.stock.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Amitie;

@Repository
public interface AmitieDao extends JpaRepository<Amitie,Long> {
	
     public List<Amitie> findByLoginUserSource(String loginUserSource);
     
     public Amitie findByLoginUserSourceAndLoginUserDestination(String loginUserSource, String loginUserDestination);
    
}
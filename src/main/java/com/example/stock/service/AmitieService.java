package com.example.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.dao.AmitieDao;
import com.example.stock.bean.Amitie;

@Service
public class AmitieService {
	
	@Autowired
    private AmitieDao amitieDao;

	public List<Amitie> findByLoginUserSource(String loginUserSource) {
		return amitieDao.findByLoginUserSource(loginUserSource);
	}

	public Amitie findByLoginUserSourceAndLoginUserDestination(String loginUserSource, String loginUserDestination) {
		return amitieDao.findByLoginUserSourceAndLoginUserDestination(loginUserSource, loginUserDestination);
	}

	public int save(Amitie amitie) {
		if(findByLoginUserSourceAndLoginUserDestination(amitie.getLoginUserSource(), amitie.getLoginUserDestination()) != null) {
			return -1;
		}
		else {
			amitieDao.save(amitie);
			return 1;
		}
	}

	public List<Amitie> findAll() {
		return amitieDao.findAll();
	}
	
}

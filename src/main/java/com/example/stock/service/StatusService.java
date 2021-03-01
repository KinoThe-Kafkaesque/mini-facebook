package com.example.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.bean.Status;
import com.example.stock.dao.StatusDao;

@Service
public class StatusService {
	
	@Autowired
	private StatusDao statusDao;
	
	public Status findByCode(String code) {
		return statusDao.findByCode(code);
	}
	
	public List<Status> findByLoginUserSourceString(String loginUserSourceString) {
		return statusDao.findByLoginUserSourceString(loginUserSourceString);
	}
	
    public int save(Status status) {
        if (findByCode(status.getCode()) != null) {
            return -1;
        } else {
            statusDao.save(status);
            return 1;
        }
    }
	
	public List<Status> findAll() {
		return statusDao.findAll();
	}
	
}

package com.example.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.dao.UserDao;
import com.example.stock.bean.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public User findByLogin(String login) {
		return userDao.findByLogin(login);
	}

	public User findByPhoneNumber(String phoneNumber) {
		return userDao.findByPhoneNumber(phoneNumber);
	}
	
	public List<User> findByNomAndPrenom(String nom, String prenom) {
		return userDao.findByNomAndPrenom(nom, prenom);
	}
	
	public int seConnecterLogin(String login, String password) {
		User user = findByLogin(login);
		if(user == null) {
			return -1;
		}
		else if(!user.getPassword().equals(password)) {
			return -2;
		}
		else {
			return 1;
		}
	}
	
	public int seConnecterPhoneNumber(String phoneNumber, String password) {
		User user = findByPhoneNumber(phoneNumber);
		if(user == null) {
			return -1;
		}
		else if(!user.getPassword().equals(password)) {
			return -2;
		}
		else {
			return 1;
		}
	}

	public int save(User user) {
		if(findByLogin(user.getLogin()) != null && findByPhoneNumber(user.getPhoneNumber()) != null) {
			return -1;
		}
		else {
			userDao.save(user);
			return 1;
		}
	}
	
	public List<User> findAll() {
		return userDao.findAll();
	}
	
}

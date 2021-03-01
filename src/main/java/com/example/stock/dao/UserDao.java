package com.example.stock.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	
	public User findByLogin(String login);
	
	public User findByPhoneNumber(String phoneNumber);
	
	public List<User> findByNomAndPrenom(String nom, String prenom);

}

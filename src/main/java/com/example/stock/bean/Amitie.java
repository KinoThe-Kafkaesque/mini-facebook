package com.example.stock.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Amitie implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String loginUserSource;
	private String loginUserDestination;
	private boolean validation;
	private String dateValidation;
	
	public Amitie() {
		super();
	}

	public Amitie(Long id, String loginUserSource, String loginUserDestination, boolean validation, String dateValidation) {
		super();
		this.id = id;
		this.loginUserSource = loginUserSource;
		this.loginUserDestination = loginUserDestination;
		this.validation = validation;
		this.dateValidation = dateValidation;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getLoginUserSource() {
		return loginUserSource;
	}
	
	public void setLoginUserSource(String loginUserSource) {
		this.loginUserSource = loginUserSource;
	}
	
	public String getLoginUserDestination() {
		return loginUserDestination;
	}
	
	public void setLoginUserDestination(String loginUserDestination) {
		this.loginUserDestination = loginUserDestination;
	}
	
	public boolean isValidation() {
		return validation;
	}
	
	public void setValidation(boolean validation) {
		this.validation = validation;
	}

	public String getDateValidation() {
		return dateValidation;
	}
	
	public void setDateValidation(String dateValidation) {
		this.dateValidation = dateValidation;
	}

}
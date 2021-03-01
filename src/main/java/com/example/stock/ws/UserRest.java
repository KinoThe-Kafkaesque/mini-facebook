package com.example.stock.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock.bean.User;
import com.example.stock.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("projet-mini-facebook/user")
@Api("Cette classe gère le user")
public class UserRest {
	
	@Autowired
	private UserService userService;
	
	@ApiOperation("cherche user par login")
	@GetMapping("/login/{login}")
	public User findByLogin(@PathVariable String login) {
		return userService.findByLogin(login);
	}
	
	@ApiOperation("cherche user par numero de tel")
	@GetMapping("/phoneNumber/{phoneNumber}")
	public User findByPhoneNumber(@PathVariable String phoneNumber) {
		return userService.findByPhoneNumber(phoneNumber);
	}
	
	@ApiOperation("cherche user par nom")
	@GetMapping("/nom/{nom}/prenom/{prenom}")
	public List<User> findByNomAndPrenom(@PathVariable String nom, String prenom) {
		return userService.findByNomAndPrenom(nom, prenom);
	}
	
	@ApiOperation("se connecter avec test de login et password")
	@GetMapping("/login/{login}/password/{password}")
	public int seConnecterLogin(@PathVariable String login, String password) {
		return userService.seConnecterLogin(login, password);
	}
	
	@ApiOperation("se connecter avec test de numero de tel et password")
	@GetMapping("/phoneNumber/{phoneNumber}/password/{password}")
	public int seConnecterPhoneNumber(@PathVariable String phoneNumber, String password) {
		return userService.seConnecterPhoneNumber(phoneNumber, password);
	}
	
	@ApiOperation("save user avec login et numero de tel uniques")
	@PostMapping("/user")
	public int save(@RequestBody User user) {
		return userService.save(user);
	}
	
	@ApiOperation("cherche tous les users")
	@GetMapping("/user")
	public List<User> findAll() {
		return userService.findAll();
	}
	
}

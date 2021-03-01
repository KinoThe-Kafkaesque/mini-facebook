package com.example.stock.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock.bean.Amitie;
import com.example.stock.service.AmitieService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("projet-mini-facebook/amitie")
@Api("Cette classe gère l'amitie")
public class AmitieRest {
	
	@Autowired
	private AmitieService amitieService;
	
	@ApiOperation("cherche les amities d'un user")
	@GetMapping("/loginUserSource/{loginUserSource}")
	public List<Amitie> findByloginUserSource(@PathVariable String loginUserSource) {
		return amitieService.findByLoginUserSource(loginUserSource);
	}
	
	@ApiOperation("cherche une amitie entre deux users")
	@GetMapping("/loginUserSource/{loginUserSource}/loginUserDestination/{loginUserDestination}")
	public Amitie findByloginUserSourceAndloginUserDestination(@PathVariable String loginUserSource, String loginUserDestination) {
		return amitieService.findByLoginUserSourceAndLoginUserDestination(loginUserSource, loginUserDestination);
	}
	
	@ApiOperation("save amitie entre deux users uniques")
	@PostMapping("/amitie")
	public int save(@RequestBody Amitie amitie) {
		return amitieService.save(amitie);
	}
	
	@ApiOperation("cherche toutes les amities")
	@GetMapping("/amitie")
	public List<Amitie> findAll() {
		return amitieService.findAll();
	}
	
}
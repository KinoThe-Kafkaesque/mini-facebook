package com.example.stock.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock.bean.Status;
import com.example.stock.service.StatusService;

@RestController
@RequestMapping("projet-mini-facebook/status")
public class StatusRest {
	
	@Autowired
	private StatusService statusService;
	
	@GetMapping("/code/{code}")
	public Status findByCode(@PathVariable String code) {
		return statusService.findByCode(code);
	}
	
	@GetMapping("/loginUserSourceString/{loginUserSourceString}")
	public List<Status> findByLoginUserSourceString(@PathVariable String loginUserSourceString) {
		return statusService.findByLoginUserSourceString(loginUserSourceString);
	}

	@PostMapping("/status")
	public void save(@RequestBody Status status) {
		statusService.save(status);
	}
	
	@GetMapping("/status")
	public List<Status> findAll() {
		return statusService.findAll();
	}
	
}

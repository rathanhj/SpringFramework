package com.durga.springframework1.game.sample.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durga.springframework1.game.sample.enterprise.flow.busniess.BusinessService;


@RestController
public class Controller {

	@Autowired
	private BusinessService businessservice;
	
	//"/sum"=100;
	@GetMapping("/rat")
	public long displaySum() {
		return businessservice.calculateSum();
	}
	}
	




package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.services.RouletteService;


@RestController
public class RouletteController {
	@Autowired
	private RouletteService rouletteService;


	@GetMapping("/roulette")
	public String getAllRoulette(){
		return "1";
	}


	@PostMapping("/roulette/")
	public void createRoulette() {

	}

	@PostMapping("/roulette/:id/open/")
	public void openRoulette(@PathVariable(value = "id" ) int id) {
		return "OK";
	}

	@PostMapping("/roulette/:id/close/")
	public void closeRoulette(@PathVariable(value = "id") int id) {

	}

}

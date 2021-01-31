package com.example.demo.controllers;

import com.example.demo.models.Bet;
import com.example.demo.models.Roulette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.services.RouletteService;

import java.util.List;


@RestController
public class RouletteController {

	private RouletteService rouletteService;

	@Autowired
	public RouletteController(RouletteService rouletteService){
		this.rouletteService = rouletteService;
	}


	@GetMapping("/roulette")
	public List<Roulette> getAllRoulette(){
		return rouletteService.getAllRoulettes();
	}


	@PostMapping("/roulette/")
	public int createRoulette() {
		return rouletteService.createRoulette();
	}



}

package com.example.demo.services;

import com.example.demo.dao.RouletteDAO;
import com.example.demo.models.Roulette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouletteService {

	@Autowired
	private RouletteDAO rouletteDAO;

	public int createRoulette() {
		return rouletteDAO.createRoulette();
	}

	public List<Roulette> getAllRoulettes(){
		return rouletteDAO.getAllRoulettes();
	}

}

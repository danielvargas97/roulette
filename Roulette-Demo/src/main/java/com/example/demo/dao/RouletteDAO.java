package com.example.demo.dao;

import com.example.demo.models.Roulette;

import java.util.List;

public interface RouletteDAO {

    public int createRoulette();
    public List<Roulette> getAllRoulettes();

}

package com.example.demo.dao;

import com.example.demo.models.Bet;

import java.util.List;

public interface BetDAO {
    public Bet makeColorBetting(Bet newBetting, int roulette_id);
    public Bet makeNumberBetting(Bet newBetting, int roulette_id);
    public String openRoulette(int roulette_id);
    public List<Bet> closeRoulette(int roulette_id);
}

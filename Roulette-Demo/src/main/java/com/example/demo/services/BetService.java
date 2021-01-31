package com.example.demo.services;

import com.example.demo.dao.BetDAO;
import com.example.demo.models.Bet;
import com.example.demo.models.ColorBet;
import com.example.demo.models.NumberBet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BetService {

    private BetDAO betDAO;

    @Autowired
    public BetService(BetDAO betDAO){
        this.betDAO = betDAO;
    }

    public Bet makeColorBetting(int user_id, int roulette_id, int money, String color){
        int selected_color = getSelectedColor(color);
        Bet roulette_bet = new ColorBet("0",money,selected_color);
        return betDAO.makeColorBetting(roulette_bet, roulette_id);
    }


    public Bet makeNumberBetting(int user_id, int roulette_id, int money, int roulette_number){
        Bet roulette_bet = new NumberBet("0",money,roulette_number);
        return betDAO.makeNumberBetting(roulette_bet, roulette_id);
    }

    public String openRoulette( int roulette_id){
        return betDAO.openRoulette(roulette_id);
    }

    public List<Bet> closeRoulette(int roulette_id){
        return betDAO.closeRoulette(roulette_id);
    }

    public int getSelectedColor(String color){
        if(color.equalsIgnoreCase("Black")){
            return 0;
        }
        else if(color.equalsIgnoreCase("Red")){
            return 1;
        }

        else{
            return 0;
        }

    }

}

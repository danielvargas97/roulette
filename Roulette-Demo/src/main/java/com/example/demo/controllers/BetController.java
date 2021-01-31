package com.example.demo.controllers;

import com.example.demo.models.Bet;
import com.example.demo.services.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import java.text.DateFormat;
import java.util.List;

@RestController
public class BetController {

    private BetService betService;

    @Autowired
    public BetController(BetService betService){
        this.betService = betService;
    }

    @PostMapping("/bet")
    public Bet makeNumberBetting(@RequestHeader(name = "user_id") int user_id,  @RequestParam( value = "money", defaultValue = "0") int money, @RequestParam( value = "roulette_id") int roulette_id, @RequestParam(value = "number") String number, @RequestParam(value = "color") String color){

        if(color.length() > 0){

            return betService.makeColorBetting(user_id, money, roulette_id, color);
        }
        else if (number.length() > 0 ){
            Integer roulette_number = Integer.parseInt(number);

            return betService.makeNumberBetting(user_id,roulette_id,money, roulette_number);
        }

    }

    @PostMapping("/bet/{id}/open/")
    public String openRoulette(@PathVariable(value = "id" ) int roulette_id) {

        return betService.openRoulette(roulette_id);
    }

    @PostMapping("/bet/{id}/close/")
    public List<Bet> closeRoulette(@PathVariable(value = "id") int roulette_id) {

        return betService.closeRoulette(roulette_id);
    }

}

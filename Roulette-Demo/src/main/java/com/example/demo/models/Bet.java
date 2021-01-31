package com.example.demo.models;

public class Bet {
    private String id;
    private int cash;
    private int winner_bet;

    public Bet() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}

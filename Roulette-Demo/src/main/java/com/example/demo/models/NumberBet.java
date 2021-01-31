package com.example.demo.models;

public class NumberBet implements Bet {
    private String id;
    private float cash;
    private float resultingCash;
    private int selected_number;
    private final float bet_factor = 5.0f;
    private boolean winnerBet;


    public NumberBet(String id, float cash, int selected_number) {
        this.id = id;
        this.cash = cash;
        this.selected_number = selected_number;
    }

    @Override
    public float getBetResult() {
        return this.resultingCash;
    }

    @Override
    public void setBetResult(int roulette_result) {
        if(roulette_result  == this.selected_number){
            this.winnerBet = true;
            this.resultingCash = bet_factor*cash;
        }
        else{
            this.winnerBet = false;
            this.resultingCash = 0;
        }
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public float getCash() {
        return this.cash;
    }

    @Override
    public void setCash(float cash) {
        this.cash = cash;
    }

    @Override
    public boolean isWinnerBet() {
        return false;
    }

    @Override
    public void setWinnerBet(boolean winnerBet) {
        this.winnerBet = winnerBet;
    }
}

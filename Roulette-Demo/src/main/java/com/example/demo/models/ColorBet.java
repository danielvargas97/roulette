package com.example.demo.models;

public class ColorBet implements Bet {
    private String id;
    private float cash;
    private float resultingCash;
    private int selected_color;
    private final float bet_factor = 1.8f;
    private boolean winnerBet;


    public ColorBet(String id, float cash, int selected_color) {
        this.id = id;
        this.cash = cash;
        this.selected_color = selected_color;
    }

    @Override
    public float getBetResult() {
        return this.resultingCash;
    }

    @Override
    public void setBetResult(int roulette_result) {
        if(roulette_result % 2 == this.selected_color){
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

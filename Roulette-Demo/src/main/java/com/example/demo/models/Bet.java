package com.example.demo.models;

public interface Bet {

    public float getBetResult();
    public void setBetResult(int roulette_result);

    public String getId();
    public void setId(String id);
    public float getCash();
    public void setCash(float cash);
    public boolean isWinnerBet();
    public void setWinnerBet(boolean winnerBet);
}

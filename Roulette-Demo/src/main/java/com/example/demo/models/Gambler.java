package com.example.demo.models;

public class Gambler {
    private String id;
    private int availableCash;

    public Gambler() {

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAvailableCash() {
        return availableCash;
    }

    public void setAvailableCash(int availableCash) {
        this.availableCash = availableCash;
    }
}

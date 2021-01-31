package com.example.demo.models;

import java.util.Random;

public class Roulette {
	private String id;
	private int number;
	private int state;
	
	private final int MAX_NUMBER = 37;
	
	public Roulette() {
		
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}

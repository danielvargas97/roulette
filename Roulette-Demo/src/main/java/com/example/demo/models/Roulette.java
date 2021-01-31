package com.example.demo.models;

import java.util.Random;
import java.util.Date;

public class Roulette {
	private String id;
	private int number;
	private int state;
	private Date openingDate;
	private Date closingDate;
	
	private final int MAX_NUMBER = 37;
	
	public Roulette() {
		this.state = 0;
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

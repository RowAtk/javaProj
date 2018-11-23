package com.backEnd;

import java.util.*;

/**
 * 
 */
public class Accessory {

	private int number;
	private String name;
	private String condition;

	/**
	 * Default constructor
	 */
	public Accessory() { }

	public Accessory(int number, String name, String condition){
		this.number = number;
		this.name = name;
		this.condition = condition;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void display(){
		System.out.println("Number: " + getNumber());
		System.out.println("Name: " + getName());
		System.out.println("Condition: " + getCondition());
	}
}

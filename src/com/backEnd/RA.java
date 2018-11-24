package com.backEnd;

import java.util.*;

/**
 * 
 */
public class RA {

	private String title;
	private String employee;
	private String position;

	/**
	 * Default constructor
	 */
	public RA() { }

	public RA(String title, String employee, String position){
		this.title = title;
		this.employee = employee;
		this.position = position;
	}

	public String getTitle() {
		return title;
	}

	public String getEmployee() {
		return employee;
	}

	public String getPosition() {
		return position;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void display(){
		System.out.println("Title: " + getTitle());
		System.out.println("Employee: " + getEmployee());
		System.out.println("Position: " + getPosition());
	}
}
package com.backEnd;

import java.util.*;

/**
 * 
 */
public class Student extends Resident{

	private String major;

	/**
	 * Default constructor
	 */
	public Student() { }

	public Student(String name, String house, String contact, String major){
		super(name, house, contact);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void display(){
		System.out.println("Major: " + getMajor());
	}
}
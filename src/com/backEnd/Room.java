package com.backEnd;

import java.util.*;

/**
 * 
 */
public class Room {
	//Room fields
	private int number;
	private String title;
	private int capacity;
	private ArrayList<Student> occupants = new ArrayList<Student>();
	private RA ra;
	private ArrayList<Accessory> accessories = new ArrayList<Accessory>();


	/**
	 * Default constructor
	 */
	//public Room() { }

	public Room(int number, String title, ArrayList<Student> studentList, RA ra, int capacity){
		this.number = number;
		this.title = title;
		this.occupants = studentList;
		this.ra = ra;
		this.capacity = capacity;
	}

	public int getNumber(){
		return this.number;
	}

	public String getTitle() {
		return title;
	}

	public int getCapacity() {
		return capacity;
	}

	public RA getRa() {
		return ra;
	}

	public ArrayList<Accessory> getAccessories() {
		return accessories;
	}

	public ArrayList<Student> getOccupants() {
		return occupants;
	}

	public int getOccupancy(){
		return getOccupants().size();
	}

	public void setAccessories(ArrayList<Accessory> accessories) {
		this.accessories = accessories;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setOccupants(ArrayList<Student> occupants) {
		this.occupants = occupants;
	}

	public void setRa(RA ra) {
		this.ra = ra;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void showMembers(){
		for (Student member: getOccupants()
		     ) {
			System.out.println(member);
		}

		System.out.println(getRa());
	}

}
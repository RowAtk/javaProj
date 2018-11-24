package com.backEnd;

import java.util.*;

/**
 * 
 */
public class Hall {
	//Hall fields
	private int hallNum;
	private String name;
	private String address;
	private String contact;
	private ArrayList<Room> roomList;
	/**
	 * Default constructor
	 */
	public Hall() { }

	public Hall(int number, String name, String address, String contact, ArrayList<Room> roomlist){
		this.hallNum = hallNum;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.roomList = roomList;
	}

	public int getNumber(){
		return hallNum;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public String getContact() {
		return contact;
	}

	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public void addRoom(){
		Scanner sc = new Scanner(System.in);
		System.out.printf("Please enter a room number:\n>>");
		int num = sc.nextInt();
		System.out.printf("Please enter a room title:\n>>");
		String t = sc.next();
		System.out.printf("Please enter a room capacity:\n>>");
		int cap = sc.nextInt();

		getRoomList().add(new Room(num, t, new ArrayList<Student>(), new RA(), cap));
	}
}
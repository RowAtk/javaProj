package com.backEnd;

import java.util.*;

/**
 * 
 */
public enum House{
	AuthurGrant("Auther Grant"),
	Buxton("Buxton"),
	Bishop("Bishop"),
	Rodgers("Rodgers"),
	Lushington("Lushington"),
	Default("Default")

	private final String name;
	House(String tag){
		this.name = tag;
	}

	public String name(){
		return this.name;
	}

	public static House findByName(String key){
		for (House hs: House.values()){
			if (key.equalsIgnoreCase(hs.name())){
				return hs;
			}
		}
		return House.Default;
	}
}




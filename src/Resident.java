
import java.util.*;

/**
 * 
 */
public class Resident {
	//Resident Fields
	public static String id = 0;
	private String name;
	private House house;
	private String contact;

	/**
	 * Default constructor
	 */
	//public Resident() { }

	public Resident(String name, String house, String contact){
		setId(nextID());
		this.name = name;
		this.house = house;
		this.contact = contact;

	}

	public static nextID(){
		return getId()++;
	}

	public String getContact() {
		return contact;
	}

	public String getHouse() {
		return house;
	}

	public static String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public static void setId(String id) {
		Resident.id = id;
	}

	public String toString(){
		String nl = "\n";
		String res = "Resident ID: " + getId() + nl +
				"Name: " + getName() + nl +
				"House: " + getHouse() +
				"Contact: " + getContact() + nl;

		return res


	}
}

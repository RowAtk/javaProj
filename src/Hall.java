
import java.util.*;

/**
 * 
 */
public class Hall {
	//Hall fields
	private int hallNum;
	private String name;
	private Address address;
	private String contact;
	private ArrayList<Room> roomList:
	/**
	 * Default constructor
	 */
	public Hall() { }

	public Hall(int number, String name, Address address, String contact, ArrayList<Room> roomlist){
		this.number = hallNum;
		this.name = name;
		this.address;
		this.contact = contact;
		this.roomlist = roomList;
	}

	public int getNumber(){
		return hallNum
	}

	public String getName(){
		return name
	}

	public Address getAddress(){
		return address;
	}

	public String getContact() {
		return contact;
	}

	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public addRoom(){
		Scanner sc = new Scanner(System.in);
		System.out.printf("Please enter a room number:\n>>");
		num = int(sc.nextln());
		System.out.printf("Please enter a room title:\n>>");
		t = String(sc.nextln());
		System.out.printf("Please enter a room capacity:\n>>");
		cap = int(sc.nextln());

		getRoomList().add(new Room(num, t, new ArrayList<Student>(), new RA(), cap));
	}
}
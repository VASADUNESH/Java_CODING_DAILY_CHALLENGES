package OCT_22;

class Room{
	private String roomType;
	{
		roomType="Standard";
		System.out.println("Room type set to Standard");
	}
	public void bookRoom() {
		System.out.println("Room Booked");
	}
	public void bookRoom(String roomType) {
		System.out.println("RoomType: "+roomType+" Booked");
	}
	public void cleanRoom() {
		System.out.println("Room cleaned");
	}
}
class HostelRoom extends Room{
	private String bedType;
	 {
        bedType = "Single Bed";
        System.out.println("Bed type set to Single Bed");
    }
	public void bookRoom() {
		System.out.println("Error: Bed type cannot be null or empty.");
	}
	public void bookRoom(String roomType,String bedType) {
		if (bedType == null || bedType.isEmpty()) {
            System.out.println("Error: Bed type cannot be null or empty.");
        } else {
            System.out.println(roomType + " with " + bedType + " booked");
        }
	}
	
	 public void cleanRoom() {
		 System.out.println("Hostel Room cleaned");
	 }
}
public class Hostel {

	public static void main(String[] args) {
		HostelRoom h1 =new HostelRoom();
		h1.bookRoom("Deluxe Hostel Room", "Double Bed");
		h1.bookRoom();
		h1.bookRoom("Deluxe Hostel Room", "");
		
	}

}
/*
Question-2
-------------

Develop a booking and maintenance system for a Hostel
Create a class named as Room 

Attributes :
roomType :String (private)

Contains an instance initializer block that sets default values for room properties. and with some relevant message.

impliment three method 

name :bookRoom()
return type :void

overload the bookRoom methods 

name :bookRoom
return Type :void
Arguments :String 
Access Modifier :public

Take one more overridden method

name :cleanRoom
return Type :void
Access Modifier :public

Take another class HostelRoom which is subclass of Room

Attributes :
bedType(String) private

Contains an instance initializer block that sets default values for room properties. and with some relevant message.

impliment three method 

name :bookRoom()
return type :void

overload the bookRoom methods 

name :bookRoom()
return Type :void
Arguments :String ,String
Access Modifier :public
this method is giving information about roomtype and bedtype

Take one more overridden method

name :cleanRoom
return Type :void
Access Modifier :public

//for achieving the runtime polymerphism this method print the specific message.

Take a main class which is having main method and instantiate the object and calling the methods.

Test cases :
-------------
case-1
--------
Booking a HostelRoom with an empty bed type:

Sample Input: hostelRoom.bookRoom("Deluxe Hostel Room", "")
Expected Output: Error: Bed type cannot be null or empty.

case-2
--------
Booking a HostelRoom with valid room type and bed type:

Sample Input: hostelRoom.bookRoom("Deluxe Hostel Room", "Double Bed")

Expected Output: Deluxe Hostel Room with Double Bed booked
*/
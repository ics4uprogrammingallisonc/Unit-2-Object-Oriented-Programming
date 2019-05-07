package src;

/*
 * Created by: Allison Cook
 * Created on: 7-May-2019
 * Created for: ICS4U
 * Day #20 (Vehicle Class)
 * This program is the class of a vehicle and then creates two vehicles 
*/
public class main {
	public main(String[] args) {
		//variables
		String colour = "";
		String licencePlate = "";
		int numDoors = 0;
		
		//get the vehicle class
		Vehicle myObject = new Vehicle();
		
		//get the scanner
		
		//get the variables from the user
		System.out.println("Licence plate number:");
	}

}

class Vehicle{
	String plateNumber = "";
	String colour = "";
	int numDoors = 0;
	int speed = 0;
	final int MAX_SPEED1 = 60;
	final int MAX_SPEED2 = 70;
	
	//get the new car
	public void Make(String newPlateNumber, String newColour, int newNumDoor) {
		//change the variables
		plateNumber = newPlateNumber;
		colour = newColour;
		numDoors = newNumDoor;
	}
	
}

/*
 * Created by: Allison Cook
 * Created on: 10-May-2019
 * Created for: ICS4U
 * Day #22 (Inheritance)
 * This program is the class of a vehicle and then creates a bike and a truck which inherits some of the vehicle values
*/
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		//variables
		int numDoors = 0;
		String colour;
		String plateNumber;
		
		//scanner
		Scanner read = new Scanner(System.in);
		
		//get info from user
		//get the variables from the user
		System.out.println("Licence plate number:");
		//get the input 
		plateNumber = read.nextLine();
		
		//get the colour
		System.out.println("Colour:");
		//get the input 
		colour = read.nextLine();
		
		//until they enter a int
		while(numDoors == 0) {
			System.out.println("Number of doors:");
			
			//wait before asking again
			TimeUnit.SECONDS.sleep(5);
			
			try {
				//get the input
				numDoors = Integer.parseInt(read.nextLine());
			}
			catch(Exception e)
			{
				//display error message if not an int
				System.out.println("Please enter an integer.");
			}
		}
		
		//vehicle class
		//Vehicle myObject = new Vehicle(plateNumber, colour, numDoors);
		
		//myObject.Display();
		
		Truck myTruck = new Truck(plateNumber, colour, numDoors);
		
		myTruck.Display();
		
		System.out.println();
		
	}

}

class Vehicle{
	
	public Vehicle(String plateNum, String tempColour, int tempnumDoors){
		//set the plate number
		plateNumber = plateNum;
		colour = tempColour;
		numDoors = tempnumDoors;
	}	
	private String plateNumber = "";
	private String colour = "";
	private int numDoors = 0;
	private int speed = 0;
	private final int MAX_SPEED = 80;
	
	protected void Brake() {
		//take away from the speed
		if (speed != 0) {
			//take away
			speed = speed - 5;
		}	
	}
	
	protected void Accelerate() {
		//if the speed isn't at the limit or is 5 below
		if(speed != MAX_SPEED & speed != MAX_SPEED - 5) {
			//add to the speed
			speed = speed + 10;
		}
	}
	
	public void Display() {
		//output all the information on the car
		System.out.println("Your Car"  + ": 1");
		System.out.println("Licence plate number: " + plateNumber);
		System.out.println("Colour: " + colour);
		System.out.println("Number of doors: " + numDoors);
		System.out.println("Speed: " + speed + "km/h");
		System.out.println("Max Speed: " + MAX_SPEED + "km/h");
	}
	
}

class Truck extends Vehicle{

	public Truck(String plateNum, String tempColour, int tempnumDoors) {
		super(plateNum, tempColour, tempnumDoors);
		
	}
	
	
}
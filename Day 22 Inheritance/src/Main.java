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
		int wheels = 0;
		int lenght = 0;
		int seats = 0;
		
		//scanner
		Scanner read = new Scanner(System.in);
		
		//start with the truck
		System.out.println("Your truck:");
		
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
		
		//until they enter a int
			while(wheels == 0) {
				System.out.println("Number of wheels:");
					
				//wait before asking again
				TimeUnit.SECONDS.sleep(5);
					
				try {
					//get the input
					wheels = Integer.parseInt(read.nextLine());
				}
				catch(Exception e)
				{
					//display error message if not an int
					System.out.println("Please enter an integer.");
				}
			}
			
			//until they enter a int
			while(lenght == 0) {
				System.out.println("Length:");
					
				//wait before asking again
				TimeUnit.SECONDS.sleep(5);
					
				try {
					//get the input
					lenght = Integer.parseInt(read.nextLine());
				}
				catch(Exception e)
				{
					//display error message if not an int
					System.out.println("Please enter an integer.");
				}
			}
		
		//get truck class
		Truck myTruck = new Truck(plateNumber, colour, numDoors, wheels, lenght);
		
		//start the bike
		System.out.println("Your Bike:");
		
		//get the colour
		System.out.println("Colour:");
		//get the input 
		colour = read.nextLine();
		
		//get the number of wheels
		while(wheels == 0) {
			System.out.println("Number of wheels:");
				
			//wait before asking again
			TimeUnit.SECONDS.sleep(5);
				
			try {
				//get the input
				wheels = Integer.parseInt(read.nextLine());
			}
			catch(Exception e)
			{
				//display error message if not an int
				System.out.println("Please enter an integer.");
			}
		}
		
		
		//get the number of seats
		while(seats == 0) {
			System.out.println("Number of seats:");
				
			//wait before asking again
			TimeUnit.SECONDS.sleep(5);
				
			try {
				//get the input
				seats = Integer.parseInt(read.nextLine());
			}
			catch(Exception e)
			{
				//display error message if not an int
				System.out.println("Please enter an integer.");
			}
		}
		
		//get the bike class
		Bike myBike = new Bike(colour, seats, wheels);
		
		
			//display the new truck
			myTruck.Display();
				
			//display the bike
			myBike.Display();
				
		
	}

}

class Vehicle{
	
	public Vehicle(String plateNum, String tempColour, int tempnumDoors){
		//set the plate number
		plateNumber = plateNum;
		colour = tempColour;
		numDoors = tempnumDoors;
	}	
	protected String plateNumber = "";
	protected String colour = "";
	protected int numDoors = 0;
	protected int speed = 0;
	protected final int MAX_SPEED = 80;
	
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
	
	//get speed
	public int getSpeed() {
		return speed;
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
	
	//add two more variables for the truck class
	int numWheels = 0;
	int lenght = 0;

	public Truck(String plateNum, String tempColour, int tempnumDoors, int wheels, int tempLenght) {
		super(plateNum, tempColour, tempnumDoors);
		//set the other variables
		numWheels = wheels;
		lenght = tempLenght;
	}	
		
	//display the truck
	public void Display() {
		//output all the information on the truck
				System.out.println("Your truck");
				System.out.println("Licence plate number: " + plateNumber);
				System.out.println("Colour: " + colour);
				System.out.println("Number of doors: " + numDoors);
				System.out.println("Number of wheels: " + numWheels);
				System.out.println("Length: " + lenght);
				System.out.println("Speed: " + speed + "km/h");
				System.out.println("Max Speed: " + MAX_SPEED + "km/h");
	}
}

class Bike extends Vehicle{
	
	//variables
	int seats;
	int numWheels; 
	final int MAX_SPEED = 40;

	public Bike(String tempColour, int numSeats, int wheels) {
		super("", tempColour, 0);
		//set the other variables
		numWheels = wheels;
		seats = numSeats;
	}
	
	//display the bike
	public void Display() {
		//output all the information on the bike
		System.out.println("Your bike");
		System.out.println("Colour: " + colour);
		System.out.println("Number of wheels: " + numWheels);
		System.out.println("Number of seats: " + seats);
		System.out.println("Speed: " + speed + "km/h");
		System.out.println("Max Speed: " + MAX_SPEED + "km/h");
	}
	
}
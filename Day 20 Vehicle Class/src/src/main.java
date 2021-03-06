package src;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/*
 * Created by: Allison Cook
 * Created on: 7-May-2019
 * Created for: ICS4U
 * Day #20 (Vehicle Class)
 * This program is the class of a vehicle and then creates two vehicles 
*/
public class main {
	public static void main(String[] args) throws InterruptedException {
		//variables
		String colour = "";
		String licencePlate = "";
		int numDoors = 0;
		String letter = " ";
		int carNum = 0;
		
		//get the vehicle class
		Vehicle myObject = new Vehicle();
		
		//get the scanner
		Scanner read = new Scanner(System.in);
		
		//loop through for each car
		for(int counter = 0; counter < 2; counter ++) {
			
			//get the variables from the user
			System.out.println("Licence plate number:");
			//get the input 
			licencePlate = read.nextLine();
			//call the function to set the variable
			myObject.PlateNumber(licencePlate);
			
			//get the colour
			System.out.println("Colour:");
			//get the input 
			colour = read.nextLine();
			myObject.Colour(colour);
			
			//get the number of doors
			//until they enter a int
			while(numDoors == 0) {
				System.out.println("Number of doors:");
				
				//wait before asking again
				TimeUnit.SECONDS.sleep(5);
				
				try {
					//get the input
					numDoors = Integer.parseInt(read.nextLine());
					//set the num doors
					myObject.NumDoors(numDoors);
				}
				catch(Exception e)
				{
					//display error message if not an int
					System.out.println("Please enter an integer.");
				}
			}
			
			//get speed of vehicle
			for (int counterB = 0; counterB <= 10; counterB ++) {
				System.out.println("Enter A to accerlate or B to brake, this will affect the speed of your vehicle.");
				//get the letter
				letter = read.nextLine();
				letter = letter.toLowerCase();
				
				//check that it is a or b
				while(letter.equals("a") == false && letter.equals("b") == false ) {
					//display error message
					System.out.println("Only enter A or B. A to accerlate or B to brake");
					
					//get the letter
					letter = read.nextLine();
					letter = letter.toLowerCase();
				}
				if(letter.equals("a")) {
					//call accelerate
					myObject.Accelerate();
				}
				else {
					//call brake
					myObject.Brake();
				}
			}
			
			//set which car number it is
			carNum ++;
			
			//display the car
			myObject.Display(carNum);
			
		}
		
	}

}

class Vehicle{
	
	Vehicle(){
	}	
	private String plateNumber = "";
	private String colour = "";
	private int numDoors = 0;
	private int speed = 0;
	private final int MAX_SPEED = 80;
	
	//get the numbers
	public String PlateNumber(String temp) {
		//set the plate number
		plateNumber = temp;
		return plateNumber;
	}
	public String Colour(String temp) {
		//set the colour
		colour = temp;
		return colour;
	}
	public int NumDoors(int temp) {
		//get the number of doors
		numDoors = temp;
		return numDoors;
	}
	
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
	
	public void Display(int num) {
		//output all the information on the car
		System.out.println("Your Car" + num + ":");
		System.out.println("Licence plate number: " + plateNumber);
		System.out.println("Colour: " + colour);
		System.out.println("Number of doors: " + numDoors);
		System.out.println("Speed: " + speed + "km/h");
		System.out.println("Max Speed: " + MAX_SPEED + "km/h");
	}
	
}

// WW CS-1102 4.2018 

// Include library
import java.io.*;

// Create class called GravityCacluator
public class GravityCalculator {

// Define main method    
public static void main(String[] arguments){

// Declare the following variables below:  
double gravity =-9.81; // Earth's gravity in m/s^2

double initialVelocity = 0.0; // starting velocity of the object

double fallingTime = 10.0; // time in seconds that the object falls

double initialPosition = 1000.0; // Starting position in meters, the calculation will determine the ending position in meters

double finalPosition = 0.0;

// Compute position of the object
finalPosition = 0.5 * (gravity) * (Math.pow(fallingTime, 2)) + (initialVelocity*fallingTime) + initialPosition;

// This will display the result 
System.out.println("The object's position after " + fallingTime +" seconds is "+finalPosition + " m.");

}
}
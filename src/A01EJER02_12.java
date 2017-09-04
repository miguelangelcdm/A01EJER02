/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author MAGD7-PC
 */
public class A01EJER02_12 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	// Create new Scanner object.



		// Prompt user to enter the airplane's acceleration a and take-off spead v.

		System.out.print("Enter speed and acceleration: ");

		double speed = input.nextDouble();

		double acceleration = input.nextDouble();



		// Compute the minimum runway length 

		// needed for an airplane to take off.

		double length = Math.pow(speed, 2) / (2 * acceleration);



		// Display result

		System.out.println("The minimum runway length for this" +" airplane is " + length);

	}
}

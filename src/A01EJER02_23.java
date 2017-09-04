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
public class A01EJER02_23 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter the distace to drive, the fuel 

		// efficiency of the car in miles and the price per gallon.

		System.out.print("Enter the driving distace: ");

		double distace = input.nextDouble();

		System.out.print("Enter miles per gallon: ");

		double milesPerGallon = input.nextDouble();

		System.out.print("Enter price per gallon: ");

		double pricePerGallon = input.nextDouble();



		// Compute the cost of driving

		double costOfDriving = (distace / milesPerGallon) * pricePerGallon;



		// Display result

		System.out.println("The cost of driving is $" + costOfDriving);

	}
}

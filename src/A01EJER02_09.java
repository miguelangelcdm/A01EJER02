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
public class A01EJER02_09 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	// Create a Scanner object



		// Prompt the user to enter the starting velocity v0 in meters/second.

		// The ending velocity v1 in meters/second, and the time span t in seconds.

		System.out.print("Enter v0, v1 and t: ");

		double v0 = input.nextDouble();

		double v1 = input.nextDouble();

		double t = input.nextDouble();



		// Calculate the average acceleration

		double a = (v1 - v0) / t;



		// Display result

		System.out.println("The average acceleration is " + a);

	}
}

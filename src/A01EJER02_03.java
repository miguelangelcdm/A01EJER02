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
public class A01EJER02_03 {
    public static void main(String[] args) {

		// Create a Scanner object

		Scanner input = new Scanner(System.in);



		// Create constant value

		final double METERS_PER_FOOT = 0.305;



		// Prompt user to enter a number in feet

		System.out.print("Enter a value for feet: ");

		double feet = input.nextDouble();



		// Convert feet into meters

		double meters = feet * METERS_PER_FOOT;



		// Display results

		System.out.println(feet + " feet is " + meters + " meters");

	}
}

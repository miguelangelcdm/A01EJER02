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
public class A01EJER02_14 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final double KILOGRAMS_PER_POUND = 0.45359237;

		final double METERS_PER_INCH = 0.0254;



		// Prompt the user to enter a weight in pounds

		System.out.print("Enter weight in pounds: ");

		double weight = input.nextDouble();



		// Prompt the user to enter height in inches

		System.out.print("Enter height in inches: ");

		double height = input.nextDouble();



		// Convert weight to kilograms

		weight = weight * KILOGRAMS_PER_POUND;



		// Convert height to meters

		height = height * METERS_PER_INCH;



		// Compute BMI

		double bodyMassIndex = weight / Math.pow(height, 2);



		// Display result

		System.out.println("BMI is " + bodyMassIndex);

	}
}

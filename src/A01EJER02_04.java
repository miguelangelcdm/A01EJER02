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
public class A01EJER02_04 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 	// Create new Scanner object

		final double KILOGRAMS_PER_POUND = 0.454;	// Create constant value



		// Prompt user to enter the number of pounds

		System.out.print("Enter a number in pounds: ");

		double pounds = input.nextDouble();



		// Convert pounds into kilograms

		double kilograms = pounds * KILOGRAMS_PER_POUND;



		// Display the results

		System.out.println(pounds + " pounds is " + kilograms + " kilograms");

	}
}

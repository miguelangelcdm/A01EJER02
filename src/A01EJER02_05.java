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
public class A01EJER02_05 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	// Create new Scanner object.



		// Prompt the user to enter the subtotal and the gratuity rate

		System.out.print("Enter the subtotal and a gratuity rate: ");

		double subtotal = input.nextDouble();

		double gratuityRate = input.nextDouble();



		// Calculate gratuity and total

		double gratuity = subtotal * (gratuityRate / 100);

		double total = subtotal + gratuity;



		// Display results

		System.out.println("The gratuity is $" + gratuity +

			" and total is $" + total);

	}
}

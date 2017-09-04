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
public class A01EJER02_21 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter the investment amount,

		// annual interest rate and number of years.

		System.out.print("Enter investment amount: ");

		double amount = input.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");

		double monthlyInterestRate = input.nextDouble();

		monthlyInterestRate /= 1200;

		System.out.print("Enter number of years: ");

		int years = input.nextInt();



		// Calculate future investment value

		double futureInvestmentValue = 

			amount * Math.pow(1 + monthlyInterestRate, years * 12);

		

		// Display result

		System.out.println("Accumulated value is $" + futureInvestmentValue);

	}
}

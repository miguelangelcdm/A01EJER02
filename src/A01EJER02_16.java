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
public class A01EJER02_16 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter the side of a hexagon

		System.out.print("Enter the side: ");

		double side = input.nextDouble();



		// Compute the area of the hexagon

		double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);



		// Display result

		System.out.println("The area of the hexagon is " + area); 

	}
}

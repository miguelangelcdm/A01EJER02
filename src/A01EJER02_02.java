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
public class A01EJER02_02 {
    public static void main(String[] args) {

		// Create a Scanner object

		Scanner input = new Scanner(System.in);

		final double PI = 3.14159265359;



		// Prompt user to enter the radius and length of a cylinder

		System.out.print("Enter the radius and length of a cylinder: ");

		double radius = input.nextDouble();

		double length = input.nextDouble();



		// Comput the area and volume 

		double area = radius * radius * PI;

		double volume = area * length;



		// Display results

		System.out.println("The area is " + area);

		System.out.println("The volume is " + volume);

	}
}

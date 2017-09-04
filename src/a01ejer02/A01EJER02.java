/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a01ejer02;
import java.util.Scanner;
/**
 *
 * @author MAGD7-PC
 */
public class A01EJER02 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);



		// Prompt user to input a double

		System.out.print("Enter a degree in Celsius: ");

		double celsius = input.nextDouble();



		// Convert Celsius to Fahrenheit

		double fahrenheit = 9.0 / 5 * celsius + 32;



		// Display results

		System.out.println(celsius + " Celsius is " + fahrenheit

			+ " Fahrenheit"); 
    }
    
}

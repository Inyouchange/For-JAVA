//U10314010 ³¯¬M¦Ð 2017/10/18 18¡G50
//Let user to enter two integers,and print the gcd between two integers

import java.util.Scanner;

public class TestGCD{
	public static void main(String[] args){
		//Create a scanner
		Scanner input = new Scanner(System.in);
		GCD t = new GCD();
		
		//Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		//Print the gcd between two integers
		System.out.println("The greatest common divisor for " +n1 + " and " + n2 + " is " + t.gcd(n1, n2));
		
	}
}
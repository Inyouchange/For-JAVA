//U10314010 ³¯¬M¦Ð 2017/10/22 00:45
//Let user to enter the amount of prime numbers,and print the prime numbers

import java.util.Scanner;

public class TestPrimeNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Prompt the user for input the amount of prime numbers
		System.out.print("Enter the amount of prime numbers: ");
		int number = input.nextInt();
		System.out.print("The first " + number + " prime numbers are \n");
		PrimeNumber.printPrimeNumbers(number);
		
	}
}
	
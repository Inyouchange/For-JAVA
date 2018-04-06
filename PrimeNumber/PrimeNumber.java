//U10314010 ³¯¬M¦Ð 2017/10/22 00:45
//Create a class PrimeNumber

public class PrimeNumber{
	//Confirm the number is prime or not
	public static boolean isPrime(int number){
		for(int divisor = 2; divisor <= number / 2; divisor++){
			if(number % divisor == 0){ //If true, number is not prime
				return false; //Number is not a prime
			}
		}
		return true; //Number is prime
	}

	public static void printPrimeNumbers(int numberOfPrimes){
		//Display 10 per line
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		//Count the number of prime numbers
		int count = 0;
		//A number to be tested for primeness
		int number = 2;
		//Repeatedly find prime numbers
		while (count < numberOfPrimes){
			//Print the prime number and increase the count
			if(isPrime(number)){
				//Increase the count
				count++;
				if(count % NUMBER_OF_PRIMES_PER_LINE == 0){
				//Print the number and advance to the new line
					System.out.printf("%-5s\n", number);
				}
				else
					System.out.printf("%-5s", number);
			}

			//Check whether the next number is prime
			number++;
		}
	}
	
}

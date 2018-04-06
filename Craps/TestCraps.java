//U10314010 ³¯¬M¦Ð 2017/10/29 16:35
//A main class of Craps, and can let user to choose play again or not

import java.util.Scanner;

public class TestCraps{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		//Create the first and second dice roll
		Craps die1 = new Craps();
		Craps die2 = new Craps();
		
		//Use loop to let user play Craps again
		while(true){

			System.out.println("Let's start Craps!");
			System.out.println("Press [Enter] to roll the dice");
			input.nextLine();

			//To get the value of dice1 and dice2
			int rollDice1 = die1.rollDice();
			int rollDice2 = die2.rollDice();
			int sumOfDice = rollDice1 + rollDice2;
			System.out.println("You got a " + rollDice1 + " and a " + rollDice2);
			System.out.println("The sum is " + sumOfDice);

			//The cases that user won
			if(sumOfDice == 7 || sumOfDice == 11){
				System.out.println("You won!");
			}
			//The cases that user lose
			else if(sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12){
				System.out.println("You lose!");
			}
			//The cases that user did not win or lose, so remember point
			else{
				int myPoint = sumOfDice;
				
				//Use the loop to run the game until sumOfDice = myPoint or 7
				boolean Continue = true;
				while(Continue){
					System.out.println("Press [Enter] to roll the dice");
					input.nextLine();
					rollDice1 = die1.rollDice();
					rollDice2 = die2.rollDice();
					sumOfDice = rollDice1 + rollDice2;
					System.out.println("You got a " + rollDice1 + " and a " + rollDice2);
					System.out.println("The sum is " + sumOfDice);

					//Win by making point
					if(sumOfDice == myPoint){
						System.out.println("You won!");
						Continue = false;
					}
					//Lose by rolling 7 before point
					else if(sumOfDice == 7){
						System.out.println("You lose!");
						Continue = false;
					}
					
				}
			}
			
			//Prompt user to play Craps again or not
			System.out.println("Wanna play again? (Y/n)");
			String playAgain = input.nextLine();
			if(playAgain.equals("")){
				//Let an empty string pass
			}
			else if(playAgain.substring(0,1).equals("n")){
				break;
			}
		}		

	}
	
}
		

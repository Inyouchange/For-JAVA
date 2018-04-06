//U10314010 ³¯¬M¦Ð 2017/10/29 16:35
//Create a class Craps

import java.util.Random;

public class Craps{

	//Create random number generator 
	private int diceValue;

	public Craps(){
		diceValue = 0;
	}

	//The method to roll the dice
	//The value of the dice is number 1-6
	public int rollDice(){
		diceValue = (int) (Math.random() * 6 + 1);
		return diceValue;
	}
}
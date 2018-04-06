import java.util.Arrays;
import java.util.Scanner;

public class BeanMachine {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number of balls to drop: ");
		int balls = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		int slots = input.nextInt();
		showAnswer(balls, slots);
	}

	public static void showAnswer(int balls, int slots) {
		int position;
		int[] Path = new int[balls];
		int[][] printBalls = new int[slots][balls];
		
		//Drop the balls one at a time
		for (int i = 0; i < balls; ++i) {
			//nails = slot-1
			for (int j = 0; j < slots - 1; ++j) {
				//Position means the way where the ball roll
				//Use random to decide 0 or 1
				position = (int) (Math.random() * 2);
				
				//When position  = 0, then print out "L" ; When position = 1, then print out "R"
				//Use Path[i] to array how many times that the ball turn to right
				if (position == 0) {
					System.out.print("L");
				} 
				else {
					System.out.print("R");
					Path[i]++;
				}
			}
			System.out.println();
		}
		for (int j = 0; j < slots - 1; ++j) {
			//printBalls[j][count] means how many balls from the bottom to the top in the j slot
			int count = balls - 1;
			
			for (int i = 0; i < balls; ++i) {
				if (Path[i] == j) {
					printBalls[j][count] = 1;
					count--;
				}
			}
		}

		//To show the result in different slots
		for (int i = 0; i < balls; ++i) {
			
			//nails = slot-1
			for (int j = 0; j < slots - 1; ++j) {
				
				if (printBalls[j][i] == 1) {
					System.out.print("0");
				} 
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}

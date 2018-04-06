
//U10314010 ³¯¬M¦Ð 2017/10/28 16:45
//Let user to enter the value of coefficients,and print the result based on the discriminant
import java.util.Scanner;
import java.text.NumberFormat;
import java.security.SecureRandom;

public class TestQuadraticEquation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Create instance of SecureRandom class
		SecureRandom rand = new SecureRandom();
		//Prompt user to choose the way to enter coefficients
		System.out.println("(Enter 1 to enter coefficients by yourself, enter other number to create coefficients with random numbers.)" + "Enter number: ");
		int number = input.nextInt();
		
		//Use loop to let user can run program again
		while(true){
			//User choose to enter coefficients by himself
			if(number == 1){
				//Prompt the user for input the coefficients(a, b, c)
				System.out.print("Enter the value of a: ");
				int a = input.nextInt();
				System.out.print("Enter the value of b: ");
				int b = input.nextInt();
				System.out.print("Enter the value of c: ");
				int c = input.nextInt();
			
				//Create object
				QuadraticEquation q = new QuadraticEquation(a, b, c);
		
				//Let root1 and root2 print to second decimal place
				NumberFormat nf = NumberFormat.getInstance();
				nf.setMaximumFractionDigits(2);


				//Display the roots
				if(q.getDiscriminant() < 0)
					System.out.println("The equation has no real roots.");
				else if(q.getDiscriminant() > 0){
					System.out.println("The equation has two roots.");
					System.out.println("The roots are " + nf.format(q.getRoot1()) + "and " + nf.format(q.getRoot2()));
				}
				else{
					System.out.println("The equation has one root.");
					System.out.println("The root is " + nf.format(q.getRoot1()));
				}
			}

			//Uesr choose to create coefficients by random
			else{

				int a = rand.nextInt(50+1+50)-50;
				int b = rand.nextInt(50+1+50)-50;
				int c = rand.nextInt(50+1+50)-50;

				//Create object
				QuadraticEquation q = new QuadraticEquation(a, b, c);
		
				//Let root1 and root2 print to second decimal place
				NumberFormat nf = NumberFormat.getInstance();
				nf.setMaximumFractionDigits(2);

				System.out.println("a = " + a + ", b = " + b + ", c = " + c);
				//Display the roots
				if(q.getDiscriminant() < 0)
					System.out.println("The equation has no real roots.");
				else if(q.getDiscriminant() > 0){
					System.out.println("The equation has two roots.");
					System.out.println("The roots are " + nf.format(q.getRoot1()) + "and " + nf.format(q.getRoot2()));			}
				else{
					System.out.println("The equation has one root.");
					System.out.println("The root is " + nf.format(q.getRoot1()));
				}
				
			}

			//Prompt user to run program again or not
			System.out.println("Enter 1 to exist, or enter other number to continue." +" Enter number: ");
			int i =input.nextInt();
			if(i ==1){
				break;
			}
		} 

		
	}
}
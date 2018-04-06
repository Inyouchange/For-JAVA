//U10314010 ³¯¬M¦Ð 2017/10/10 21:50
//Print the account(name, gender, address and telephone)and BMI of three people 

import java.util.Scanner;

public class TestBMI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Prompt the user for input name1
		System.out.print("Enter your name: ");
		String name1 = input.next();

		//Prompt the user for input gender1
		System.out.print("(1-male, 0-female)" + "Enter your gender: ");
		boolean gender1 = input.next().equals("1");
		input.nextLine();

		//Prompt the user for input address1	
		System.out.print("Enter your address: ");
		String address1 = input.next();

		//Prompt the user for input telephone1
		System.out.print("Enter your telephone: ");
		String telephone1 = input.next();

		//Prompt the user for input weight1
		System.out.print("Enter your weight: ");
		double weight1 = input.nextDouble();
		double KILOGRAMS_PER_POUND = 0.45359237;

		//Prompt the user for input height1
		System.out.print("Enter your height: ");
		double height1 = input.nextDouble();
		double METERS_PER_INCH = 0.0254;
		System.out.println();

		//Prompt the user for input name2
		System.out.print("Enter your name: ");
		String name2 = input.next();

		//Prompt the user for input gender2
		System.out.print("(m-male, f-female)" + "Enter your gender: ");
		boolean gender2 = input.next().equals("m");
		input.nextLine();

		//Prompt the user for input address2	
		System.out.print("Enter your address: ");
		String address2 = input.next();

		//Prompt the user for input telephone2
		System.out.print("Enter your telephone: ");
		String telephone2 = input.next();

		//Prompt the user for input weight2
		System.out.print("Enter your weight: ");
		double weight2 = input.nextDouble();

		//Prompt the user for input height2
		System.out.print("Enter your height: ");
		double height2 = input.nextDouble();
		System.out.println();

		//Prompt the user for input name3
		System.out.print("Enter your name: ");
		String name3 = input.next();

		//Prompt the user for input gender3
		System.out.print("(m-male, f-female)" + "Enter your gender: ");
		boolean gender3 = input.next().equals("m");
		input.nextLine();

		//Prompt the user for input address3	
		System.out.print("Enter your address: ");
		String address3 = input.next();

		//Prompt the user for input telephone3
		System.out.print("Enter your telephone: ");
		String telephone3 = input.next();

		//Prompt the user for input weight3
		System.out.print("Enter your weight: ");
		double weight3 = input.nextDouble();

		//Prompt the user for input height3
		System.out.print("Enter your height: ");
		double height3 = input.nextDouble();


		//Print the first person's name
		System.out.println();
		System.out.println(name1 + "'s file");
		System.out.println("Name: " + name1);

		//Print the first person's gender
		if (gender1){
			System.out.println("Gender:male");
		}	
		else{
			System.out.println("Gender:female");
		}

		//Print the first person's address, telephone, weight and height
		System.out.println("Address: " + address1);
		System.out.println("Telephone: " + telephone1);
		System.out.println("Weight: " + weight1);
		System.out.println("Height: " + height1);

		//Calculate and print the first person's bmi
		double bmi1 = weight1 * KILOGRAMS_PER_POUND / 
			((height1 * METERS_PER_INCH) * (height1 * METERS_PER_INCH));
		System.out.println("BMI: " + bmi1);

		//Print the first person's body status
		if (gender1){
			if(bmi1<19)
				System.out.println("Underweight");
			else if(bmi1<=25)
				System.out.println("Body status:Normal");
			else if(bmi1<=30)
				System.out.println("Body status:Overweight");
			else
				System.out.println("Body status:Obese");
		}
		else{
			if(bmi1<18)
				System.out.println("Body status:Underweight");
			else if(bmi1<=24)
				System.out.println("Body status:Normal");
			else if(bmi1<=29)
				System.out.println("Body status:Overweight");
			else
				System.out.println("Body status:Obese");
		}


		//Print the second person's name
		System.out.println();
		System.out.println(name2 + "'s file");
		System.out.println("Name: " + name2);

		//Print the second person's gender
		if (gender2){
			System.out.println("Gender:male");
		}	
		else{
			System.out.println("Gender:female");
		}

		//Print the second person's address, telephone, weight and height
		System.out.println("Address: " + address2);
		System.out.println("Telephone: " + telephone2);
		System.out.println("Weight: " + weight2);
		System.out.println("Height: " + height2);

		//Calculate and print the second person's bmi
		double bmi2 = weight2 * KILOGRAMS_PER_POUND / 
			((height2 * METERS_PER_INCH) * (height2 * METERS_PER_INCH));
		System.out.println("BMI: " + bmi2);

		//Print the second person's body status
		if (gender2){
			if(bmi2<19)
				System.out.println("Body status:Underweight");
			else if(bmi2<=25)
				System.out.println("Body status:Normal");
			else if(bmi2<=30)
				System.out.println("Body status:Overweight");
			else
				System.out.println("Body status:Obese");
		}
		else{
			if(bmi2<18)
				System.out.println("Body status:Underweight");
			else if(bmi2<=24)
				System.out.println("Body status:Normal");
			else if(bmi2<=29)
				System.out.println("Body status:Overweight");
			else
				System.out.println("Body status:Obese");
		}
		

		//Print the third person's name
		System.out.println();
		System.out.println(name3 + "'s file");
		System.out.println("Name: " + name3);

		//Print the third person's gender
		if (gender3){
			System.out.println("Gender:male");
		}	
		else{
			System.out.println("Gender:female");
		}

		//Print the third person's address, telephone, weight and height
		System.out.println("Address: " + address3);
		System.out.println("Telephone: " + telephone3);
		System.out.println("Weight: " + weight3);
		System.out.println("Height: " + height3);

		//Calculate and print the third person's bmi
		double bmi3 = weight3 * KILOGRAMS_PER_POUND / 
			((height3 * METERS_PER_INCH) * (height3 * METERS_PER_INCH));
		System.out.println("BMI: " + bmi3);

		//Print the third person's body status
		if (gender3){
			if(bmi3<19)
				System.out.println("Body status:Underweight");
			else if(bmi3<=25)
				System.out.println("Body status:Normal");
			else if(bmi3<=30)
				System.out.println("Body status:Overweight");
			else
				System.out.println("Body status:Obese");
		}
		else{
			if(bmi3<18)
				System.out.println("Body status:Underweight");
			else if(bmi3<=24)
				System.out.println("Body status:Normal");
			else if(bmi3<=29)
				System.out.println("Body status:Overweight");
			else
				System.out.println("Body status:Obese");
		}

	}

}
		
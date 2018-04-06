//U103140101 ³¯¬M¦Ð 2017/11/05 23:40
//Create a class Console about the data need to use scanner

import java.util.Scanner;

public class Console{

	private static Scanner input = new Scanner(System.in);

	public static int getNumber(String prompt) {
		System.out.print(prompt);
		int n = input.nextInt(); //Prompt the user for input how many data he want to key in
		input.nextLine();  // discard any other data entered on the line
        	return n;
    	}
	
	public static String getName(String prompt){
        	System.out.print(prompt);
		String name = input.next();  //Prompt the user for input name
        	input.nextLine();  // discard any other data entered on the line
        	return name;
    	}

	public static boolean getGender(String prompt){
		System.out.print(prompt);
		boolean gender = input.next().equals("m");//Prompt the user for input gender
		input.nextLine();
		return gender;
	}

	public static int getAge(String prompt){
		System.out.print(prompt);
		int age = input.nextInt(); //Prompt the user for age
		input.nextLine();
		return age;
	}

	public static String getAddress(String prompt){
		System.out.print(prompt);
		String address = input.next();  //Prompt the user for input address
        	input.nextLine();  // discard any other data entered on the line
        	return address;
    	}

	public static String getTelephone(String prompt){
		System.out.print(prompt);
		String telephone = input.next();  //Prompt the user for input telephone
        	input.nextLine();  // discard any other data entered on the line
        	return telephone;
    	}

	public static double getWeight(String prompt){
		System.out.print(prompt);
		double weight = input.nextDouble();  //Prompt the user for input weight
        	input.nextLine();  // discard any other data entered on the line
        	return weight;
    	}

	public static double getHeight(String prompt){
		System.out.print(prompt);
		double height = input.nextDouble();  //Prompt the user for input height
        	input.nextLine();  // discard any other data entered on the line
        	return height;
    	}
}

//U103140101 ³¯¬M¦Ð 2017/12/04 02:10
//Create a class Console about the data need to use scanner

import java.util.Scanner;

public class Console{

	private static Scanner input = new Scanner(System.in);

	//Prompt the user to read the data or input the data by himself
	//Prompt the user for input how many data he want to key in
	public static int getInt(String prompt) {
		System.out.print(prompt);
		int i = input.nextInt(); //Prompt the user to read the data or input the data by himself
		input.nextLine();  // discard any other data entered on the line
        	return i;
    	}
	
	//Prompt the user for input name
	//Prompt the user for input address
	//Prompt the user for input telephone
	//Prompt the user for input birth
	//Prompt the user for input test time
	//Prompt the user for which file to read
	//Prompt the user for the next action
	public static String getString(String prompt){
        	System.out.print(prompt);
		String s = input.next();  
        	input.nextLine();  // discard any other data entered on the line
        	return s;
    	}

	public static boolean getGender(String prompt){
		System.out.print(prompt);
		boolean gender = input.next().equals("1");//Prompt the user for input gender
		input.nextLine();
		return gender;
	}

	
	//Prompt the user for input weight
	//Prompt the user for input height
	public static double getDouble(String prompt){
		System.out.print(prompt);
		double d = input.nextDouble();  
        	input.nextLine();  // discard any other data entered on the line
        	return d;
    	}
	
}

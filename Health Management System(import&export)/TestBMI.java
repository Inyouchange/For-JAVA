//U10314010 ³¯¬M¦Ð 2017/12/04 02:10
//User can key in the data, and put it in the file(data.txt), and then after sort the data by bubblesort, put it in the file(BMI.txt).User also can search people's data by name

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class TestBMI{
	public static void main(String[] args){
		// display a welcome message
		System.out.println("Welcome to the Health Management System");
		System.out.println();
			
		//Prompt the user for input how many data he want to key in
		int n = Console.getInt("Enter how many data you want to key in: ");
		
		//Put the data from scanner into data.txt
		try{
			FileWriter fw = new FileWriter("data.txt");  
        		BufferedWriter bw = new BufferedWriter(fw);

			//Use loop to input the amount of data that user want to key in 
			for(int i = 0; i < n; i++){
				//Prompt the user for input name, gender, age, address, telephone, weight and height
				String name = Console.getString("Enter your name: ");
				String address = Console.getString("Enter your address: ");
				String telephone = Console.getString("Enter your telephone: ");
				String birth = Console.getString("(YYYY-MM-DD)" + "Enter your birth: ");
				boolean gender = Console.getGender("(1-male, 0-female)" + "Enter your gender: ");
				double height = Console.getDouble("Enter your height: ");
				double weight = Console.getDouble("Enter your weight: ");
				String testtime = Console.getString("(YYYY-MM-DD)" + "Enter the time you test: ");
				
				bw.write(name + "," + address + "," + telephone + "," + birth);
				if (gender){
					bw.write(",1");
				}	
				else{
					bw.write(",0");
				}
				bw.write("," + height + "," + weight + "," + testtime + "\r\n");
				bw.flush();
			}
			bw.close();
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		//Use account and bmi array to manage data
		Account[] account = new Account[n];
		BMI[] bmi = new BMI[n];
		
		//Read the data from data.txt
		//The data in array is by lines, one line have people's name, address, telephone, birthday, gender, height, weight and testtime
		//Use "," to seperate the data in one line
		try{
			int row = 0;
			FileReader fr = new FileReader("data.txt");  
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line=br.readLine()) != null){
		    	String[] str = line.split(",");
		    	account[row] = new Account();
		    	bmi[row] = new BMI();
		    	account[row].setName(str[0]);
		    	account[row].setAddress(str[1]);
		    	account[row].setTelephone(str[2]);
		    	bmi[row].setBirth(str[3]);
		    	bmi[row].setGenderstr(str[4]);
		    	bmi[row].setHeight(Double.parseDouble(str[5]));
		    	bmi[row].setWeight(Double.parseDouble(str[6]));
		    	account[row].setTestTime(str[7]);
		    	row ++;	
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}	
		
		//Write the data into BMI.txt
		//Use bubblesort to sort the data
		try{
			FileWriter fw = new FileWriter("BMI.txt");  
        		BufferedWriter bw = new BufferedWriter(fw);
        		BubbleSort.bubbleSort(account, bmi);
        		
        		for(int i = 0; i < n; i++){
				String g = null;
				if(bmi[i].getGenderstr() != null && bmi[i].getGenderstr().equals("0")){
					g = "female";
				}
				else{
					g = "male";
				}
				bw.write("Name:" + account[i].getName() + " Address:" + account[i].getAddress() + " Telephone:" + account[i].getTelephone() + " Birthday:" + bmi[i].getBirth() + " Gender:" + g + " Height:" + bmi[i].getHeight() + " Weight:" + bmi[i].getWeight() + " BMI:" + bmi[i].getBMI() + " Body Status:" + bmi[i].getStatus() + " Body Fat:" + bmi[i].getBodyFat() + " Age:" + bmi[i].getAge() + " Test time:" + account[i].getTestTime() + "\r\n");
        		
        			bw.flush();
        		}
        		bw.close();		
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		//Use while loop to ask user what is the next action
		Boolean value = true;
		while(value){
			//Here are three options that user can choose
			String answer = Console.getString("Continue? Next.End.Search(y/n/s):");
			if(answer.equals("n")) {
				System.out.println("Thanks for your using!");
				value = false;
			}
			else if(answer.equals("s")){
				//If user want to search the data, then just key in the person's name to get information
				String tempName = Console.getString("Enter person's name:");
				for(int i = 0; i < n; i++){
					
					if(!account[i].getName().equals(tempName)){
						System.out.println("UNKNOWN");
					}
					else{
						String ge = null;
						if(bmi[i].getGenderstr() != null && bmi[i].getGenderstr().equals("0")){
							ge = "female";
						}
						else{
							ge = "male";
						}
						System.out.println("Name:" + account[i].getName() + " Address:" + account[i].getAddress() + " Telephone:" + account[i].getTelephone() + " Birthday:" + bmi[i].getBirth() + " Gender:" + ge + " Height:" + bmi[i].getHeight() + " Weight:" + bmi[i].getWeight() + " BMI:" + bmi[i].getBMI() + " Body Status:" + bmi[i].getStatus() + " Body Fat:" + bmi[i].getBodyFat() + " Age:" + bmi[i].getAge() + " Test time:" + account[i].getTestTime());
						value = true;
					}
				}
			}
			else if(answer.equals("y")){
				value = false;
			}
			else{
				System.out.println("Please enter a valid choice.");
			}
		}
	}

}

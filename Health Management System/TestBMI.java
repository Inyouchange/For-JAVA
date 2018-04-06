//U10314010 ³¯¬M¦Ð 2017/11/05 23:40
//Print the account(name, gender, address and telephone)and BMI(weight, height, bmi , status and bodyfat)
 
public class TestBMI{
	public static void main(String[] args){
		// display a welcome message
        	System.out.println("Welcome to the Health Management System");
        	System.out.println();

		//Prompt the user for input how many data he want to key in
		int n = Console.getNumber("Enter how many data you want to key in: ");	

		//Use array to print the data
		String[] name = new String[n];
		boolean[] gender = new boolean[n];
		int[] age = new int[n];
		String[] address = new String[n];
		String[] telephone = new String[n];
		double[] weight = new double[n];
		double[] height = new double[n];
		BMI[] bmi = new BMI[n];
		String[] status = new String[n];
		BMI[] BodyFat = new BMI[n];
		
		//Use loop to input the amount of data that user want to key in 
		for(int i = 0; i < n; i++){
			//Prompt the user for input name, gender, age, address, telephone, weight and height
			name[i] = Console.getName("Enter your name: ");
			gender[i] = Console.getGender("(m-male, f-female)" + "Enter your gender: ");
			age[i] = Console.getAge("Enter your age: ");
			address[i] = Console.getAddress("Enter your address: ");
			telephone[i] = Console.getTelephone("Enter your telephone: ");
			weight[i] = Console.getWeight("Enter your weight: ");
			height[i] = Console.getHeight("Enter your height: ");
		}			

		for(int i = 0; i < n; i++){
			
			//Print people's name
			System.out.println();
			System.out.println(name[i] + "'s file");
			System.out.println("Name: " + name[i]);

			//Print people's gender
			if (gender[i]){
				System.out.println("Gender:male");
			}	
			else{
				System.out.println("Gender:female");
			}

			//Print people's address, telephone, weight and height
			System.out.println("Age: " + age[i]);
			System.out.println("Address: " + address[i]);
			System.out.println("Telephone: " + telephone[i]);
			System.out.println("Weight: " + weight[i]);
			System.out.println("Height: " + height[i]);

			//Print people's bmi
			bmi[i] = new BMI(weight[i],height[i], gender[i], age[i]);
			System.out.println("BMI: " + bmi[i].getBMI());

			//Print people's body status
			if (gender[i]){
				if(bmi[i].getBMI() < 19)
					System.out.println("Body status:Underweight");
				else if(bmi[i].getBMI() <= 25)
					System.out.println("Body status:Normal");
				else if(bmi[i].getBMI() <= 30)
					System.out.println("Body status:Overweight");
				else
					System.out.println("Body status:Obese");
			}
			else{
				if(bmi[i].getBMI()<18)
					System.out.println("Body status:Underweight");
				else if(bmi[i].getBMI() <= 24)
					System.out.println("Body status:Normal");
				else if(bmi[i].getBMI() <= 29)
					System.out.println("Body status:Overweight");
				else
					System.out.println("Body status:Obese");
			}
			
			//Prompt people's bodyfat
			BodyFat[i] = new BMI(weight[i],height[i], gender[i], age[i]);
				System.out.println("Body fat: " + BodyFat[i].getBodyFat());
		}
	}
}
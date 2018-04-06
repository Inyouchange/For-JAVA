//U10314010 ³¯¬M¦Ð 2017/11/05 23:40
//Design a class named BMI

public class BMI{
	//The weight of the person in pounds
	//The height of the person in inches 
	//The gender of the person,use word(m and f) to distinguish male and female
	//The age of the person
	private double weight; //in pounds
	private double height; //in inches
	private boolean gender;
	private int age;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;


	//Create a default bmi
	public BMI(){
	}

	//Create a BMI object with the specified age, weight and height,different BMI standard for male and female
	public BMI(double weight, double height, boolean gender, int age){
		this.weight = weight;
		this.height = height;
		this.age = age;
	}

	//Return gender
	public boolean gender(){
		return gender;
	}

	//Return age
	public int getAge(){
		return age;
	}

	//Return BMI
	public double getBMI(){
		double bmi = weight * KILOGRAMS_PER_POUND / 
			((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
		return Math.round(bmi * 100) / 100.0;
	}
	
	//Return ststus
	//When gender=m means male, gender(= f) means female
	public String getStatus(){
		double bmi = getBMI();
		if (gender){
			if(bmi<19)
				return"	Underweight";
			else if(bmi<=25)
				return"Normal";
			else if(bmi<=30)
				return"Overweight";
			else
				return"Obese";
		}
		else{
			if(bmi<18)
				return"	Underweight";
			else if(bmi<=24)
				return"Normal";
			else if(bmi<=29)
				return"Overweight";
			else
				return"Obese";
		}
	}

	//Return body fat
	public double getBodyFat(){
		double bmi = getBMI();
		int age = getAge();
		if (gender){
			double bodyfat = (bmi * 1.2) + (age * 0.23) - 5.4 - (1.0 * 10.8);
			return Math.round(bodyfat * 100) / 100.0;
		}
		else{
			double bodyfat = (bmi * 1.2) + (age * 0.23) - 5.4 - (0.0 * 10.8);
			return Math.round(bodyfat * 100) / 100.0;
		}
	}

	//Return weight
	public double getWeight(){
		return weight;
	}

	//Return height
	public double getHeight(){
		return height;
	}	

}



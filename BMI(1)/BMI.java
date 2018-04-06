//U10314010 ³¯¬M¦Ð 2017/10/10 21:50
//Design a class named BMI

public class BMI{
	//The weight of the person in pounds
	//The height of the person in inches 
	//The gender of the person,use word(m and f) to distinguish male and female
	private double weight; //in pounds
	private double height; //in inches
	private boolean gender;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;


	//Create a BMI object with the specified age, weight and height,different BMI standard for male and female
	public BMI(double weight, double height, boolean gender){
		this.weight = weight;
		this.height = height;
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

	//Return weight
	public double getWeight(){
		return weight;
	}

	//Return height
	public double getHeight(){
		return height;
	}
	
	//Return gender
	public boolean gender(){
		return gender;
	}
}



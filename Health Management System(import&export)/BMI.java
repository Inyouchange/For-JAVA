//U10314010 ³¯¬M¦Ð 2017/12/04 02:10
//Design a class named BMI



import java.util.Calendar;

public class BMI {
	//The weight of the person in pounds
	//The height of the person in inches 
	//The gender of the person,use word(m and f) to distinguish male and female
	//The age of the person
	private double weight; //in pounds
	private double height; //in inches
	private String birth;
	private boolean gender;
	private String genderstr;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;


	//Create a default bmi
	public BMI(){
	}

	//Create a BMI object with the specified age, weight and height,different BMI standard for male and female
	public BMI(double weight, double height, String birth, boolean gender, String genderstr){
		this.weight = weight;
		this.height = height;
		this.birth = birth;
		this.genderstr = genderstr;
	}

	//Return weight
	public double getWeight(){
		return weight * KILOGRAMS_PER_POUND;
	}

	//Return height
	public double getHeight(){
		return height * METERS_PER_INCH;
	}	

	//Set weight
	public void setWeight(double weight){
		this.weight = weight;
	}
		
	//Set height
	public void setHeight(double height){
		this.height = height;
	}	
		
	//Return birth
	public String getBirth(){
		return birth;
	}

	//Set birth
	public void setBirth(String birth){
		this.birth = birth;
	}
	
	
	//Return gender
	public boolean getGender(){
		return gender;
	}

	//Return gender for array
	public String getGenderstr(){
		return genderstr;
	}

	//Set gender
	public void setGenderstr(String newGenderstr){
		genderstr = newGenderstr;
	}
	
	//Return BMI
	public double getBMI(){
		double bmi = weight * KILOGRAMS_PER_POUND / 
			((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
		return Math.round(bmi * 100) / 100.0;
	}
	
	//Return ststus
	//When gender=1 means male, gender(= 0) means female
	public String getStatus(){
		double bmi = getBMI();
		if (gender){
			if(bmi<19)
				return"Underweight";
			else if(bmi<=25)
				return"Normal";
			else if(bmi<=30)
				return"Overweight";
			else
				return"Obese";
		}
		else{
			if(bmi<18)
				return"Underweight";
			else if(bmi<=24)
				return"Normal";
			else if(bmi<=29)
				return"Overweight";
			else
				return"Obese";
		}
	}

	public int getAge(){
		String strs[] = birth.trim().split("-");  
		int birthYear = Integer.parseInt(strs[0]);  
		int birthMonth = Integer.parseInt(strs[1]);
		int birthDay = Integer.parseInt(strs[2]);
		
		Calendar cal = Calendar.getInstance();  
		int yearNow = cal.get(Calendar.YEAR);  
		int monthNow = cal.get(Calendar.MONTH) + 1;  
		int dayNow = cal.get(Calendar.DATE); 
		
		int yearMinus = yearNow - birthYear;  
    		int monthMinus = monthNow - birthMonth;  
    		int dayMinus = dayNow - birthDay; 
    	
		int age = yearMinus;	
    		if (yearMinus < 0) {
        		age = 0;  
    		} 	
    		else if (yearMinus == 0) {  
        		if (monthMinus < 0) {
            			age = 0;  
        		} 
        		else if (monthMinus == 0) {  
            			if (dayMinus < 0) {
            				age = 0;  
            			} 
            			else if (dayMinus >= 0) {  
                			age = 1;  
            			}  
        		} 	
        		else if (monthMinus > 0) {  
            			age = 1;  
        		}  
    		} 
    		else if (yearMinus > 0) {  
        		if (monthMinus < 0) {  
        		} 
        		else if (monthMinus == 0) {  
            			if (dayMinus < 0) {  
            			} 
            			else if (dayMinus >= 0) {  
            				age = age + 1;  
            			}  
        		} 
        		else if (monthMinus > 0) {  
        			age = age + 1;  
        		}  
    		}  
    		return age;
	}  

	//Return body fat
	public double getBodyFat(){
		double bmi = getBMI();
		int age = getAge();
		if (getGender()){
			double bodyfat = (bmi * 1.2) + (age * 0.23) - 5.4 - (1.0 * 10.8);
			return Math.round(bodyfat * 100) / 100.0;
		}
		else{
			double bodyfat = (bmi * 1.2) + (age * 0.23) - 5.4;
			return Math.round(bodyfat * 100) / 100.0;
		}
	}
}



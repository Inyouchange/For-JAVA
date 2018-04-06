//U10314010 ³¯¬M¦Ð 2017/10/28 16:45
//Create a class QuadraticEquation

public class QuadraticEquation{
	//Three coefficients
	private int a,b,c;
	private int number;

	//Create a default QuadraticEquation
	public QuadraticEquation(){
	}

	//Create QuadraticEquation with a, b, c
	public QuadraticEquation(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		this.number = number;
	}


	//Return a
	public int getA(){
		return a;
	}

	//Return b
	public int getB(){
		return b;
	}

	//Return c
	public int getC(){
		return c;
	}

	//Return the discriminant which is b^2-4ac
	public double getDiscriminant(){
		return b*b-4*a*c;
	}

	//Return the root1 of the equation
	public double getRoot1(){
		double discriminant = getDiscriminant();
		if(discriminant < 0)
			return 0;
		else
			return (-b+Math.sqrt(discriminant))/(2.0*a);
	}

	//Return the root2 of the equation
	public double getRoot2(){
		double discriminant = getDiscriminant();
		if(discriminant < 0)
			return 0;
		else
			return (-b-Math.sqrt(discriminant))/(2.0*a);
	}
		
	

	
}
//U10314010 ³¯¬M¦Ð 2017/10/18 18:50
//Create a class GCD


public class GCD{
	public static int gcd(int n1, int n2){
		int gcd = 1; //Initial gcd is 1
		int k = 2; //Possible gcd

		while(k <= n1 && k <= n2){
			if(n1 % k == 0 && n2 % k == 0)
				gcd = k; //Update gcd
			k++;
		}

		//Return gcd
		return gcd;
	}
}
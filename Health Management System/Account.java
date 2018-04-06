//U10314010 ³¯¬M¦Ð 2017/11/05 23:40
//Design a class named Account

public class Account{
	//The name,gender,address and telephone for the account
	private String name;
	private boolean gender;
	private String address;
	private String telephone;

	
	//Create a default account
 	public Account(){
	}

	//Create an account with the specified name,gender,address and telephone
	public Account(String name,boolean gender,String address,String telephone){
		this.name=name;
		boolean m=true;
		this.address=address;
		this.telephone=telephone;
	}

	//Return name
	public String getName(){
		return name;
	}

	//Set name
	public void setName(String name){
		this.name=name;
	}

	//Return gender
	public boolean getGender(){
		return gender;
	}

	//Set gender
	public void setGender(boolean gender){
		boolean m=true;
	}

	
	//Return address
	public String getAddress(){
		return address;
	}

	//Set address
	public void setAddress(String address){
		this.address=address;
	}
	
	//Return telephone
	public String getTelephone(){
		return telephone;
	}

	//Set telephone
	public void setTelephone(String telephone){
		this.telephone=telephone;
	}
}
//U10314010 ³¯¬M¦Ð 2017/12/04 02:10
//Design a class named Account


public class Account{
	//The name, gender, address, telephone and test time for the account
	private String name;
	private String address;
	private String telephone;
	private String testtime;
	
	//Create a default account
 	public Account(){
	}

	//Create an account with the specified name, gender, address, telephone, birth and test time
	public Account(String name, String address, String telephone, String testtime){
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.testtime = testtime;
	}

	//Return name
	public String getName(){
		return name;
	}

	//Set name
	public void setName(String name){
		this.name = name;
	}
	
	//Return address
	public String getAddress(){
		return address;
	}

	//Set address
	public void setAddress(String address){
		this.address = address;
	}
	
	//Return telephone
	public String getTelephone(){
		return telephone;
	}

	//Set telephone
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}

	
	//Return test time
	public String getTestTime(){
		return testtime;
	}

	//Set test time
	public void setTestTime(String testtime){
		this.testtime = testtime;
	}

	
}        	
        	
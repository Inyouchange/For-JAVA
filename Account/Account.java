//U10314010 ³¯¬M¦Ð 2017/09/30 18:00
//Design a class named Account
import java.util.Date;
public class Account{
	//The id and balance for the account
	//The annualInterestRate stores the current interest rate
	//The dateCreated stores the date when the account was created
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();

	//Create a default account
 	public Account(){
	}

	//Create an account with the specified id and initial balance
	public Account(int id,double balance){
		this.id=id;
		this.balance=balance;
	}

	//Return id
	public int getId(){
		return id;
	}
	//Set id
	public void setId(int id){
		this.id=id;
	}
	//Return balance
	public double getBalance(){
		return balance;
	}
	//Set balance
	public void setBalance(double balance){
		this.balance=balance;
	}
	//Return annualInterestRate
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	//Set annualInterestRate
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	//Return dateCreated 
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	//Return the monthly interest rate
	public double getMonthlyInterestRate(){
		return (annualInterestRate/100)/12;
	}
	//Return the monthly interest
	public double getMonthlyInterest(){
		return balance * getMonthlyInterestRate();
	}
	//Withdraw a specified amount to the account
	public double withdraw(double amount){
		return balance-=amount;
	}
	//Deposit a specified amount to the account
	public double deposit(double amount){
		return balance+=amount;
	}
}
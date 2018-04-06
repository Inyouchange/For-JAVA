//U10314010 ³¯¬M¦Ð 2018/03/10 18:30
import java.util.Date;
import java.util.ArrayList;

public class Account {
	//The name of String type to store the name of the customer
	//The id and balance for the account
	//The annualInterestRate stores the current interest rate
	//The dateCreated stores the date when the account was created
	private String name;
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions;

	//Create a default account
	Account() {
		name = "";
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
		transactions = new ArrayList<Transaction>();
	}

	//Create an account with the specified id and initial balance
	Account(int id, double balance) {
		name = "";
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}

	//Create an account with the specified name, id and balance
	Account(String name, int id, double balance) {
		this(id, balance);
		this.name = name;
	}

	//Set name
	public void setName(String name) {
		this.name = name;
	}

	//Return name 
	public String getName() {
		return name;
	}

	//Set id
	public void setId(int id) {
		this.id = id;
	}

	//Return id
	public int getId() {
		return id;
	}

	//Set balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	//Return balance
	public double getBalance() {
		return balance;
	}

	//Set annualInterestRate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	//Return annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	//Return dateCreated 
	public String getDateCreated() {
		return dateCreated.toString();
	}

	//Return the monthly interest rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	//Return the monthly interest
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	//Withdraw a specified amount to the account
	public void withdraw(double amount) {
		balance -= amount;
		transactions.add(new Transaction('W', amount, balance, 
			"Withdrawal from account"));
	}

	//Deposit a specified amount to the account
	public void deposit(double amount) {
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, 
			"Deposit to account"));
	}

	//Return transactions
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
}
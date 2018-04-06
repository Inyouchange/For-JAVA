//U10314010 ���M�� 2018/03/10 18:30
public class Transaction {
	// Data fields
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;

	//Construct a Transaction with specified date, type, balance and description 
	public Transaction(char type, double amount, double balance, String description) {
            date = new java.util.Date();
            this.type = type;
            this.amount = amount;
            this.balance = balance;
            this.description = description;
	}

	//Return date
	public String getDate() {
            return date.toString();
	}
	//Set type
	public void setType(char type) {
            this.type = type;
	}

	//Return type
	public char getType() {
            return type;
	}

	//Set amount
	public void setAmount(double amount) {
            this.amount = amount;
	}

	//Return amount
	public double getAmount() {
            return amount;
	}

	//Set balance
	public void setBalance(double balance) {
            this.balance = balance;
	}

	//Return balance
	public double getBalance() {
            return balance;
	}

	//Set description
	public void setDescription(String description) {
            this.description = description;
	}

	//Return description
	public String getDescription() {
            return description;
	}
}
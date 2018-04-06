//U10314010 ³¯¬M¦Ð 2017/09/30 18:00
//Print the balance, the monthly interest, and the date when this account was created
public class TestAccount{
	public static void main(String[] args){
		//Create an Account object with an account
		//ID of 1122, and a balance of $20,000
		Account account = new Account(1122,20000);
		//Set an annual interest rate of 4.5%
		account.setAnnualInterestRate(4.5);
		//Withdraw $2500
		account.withdraw(2500);
		//Deposit $3000
		account.deposit(3000);

		//Print the balance, the monthly interest, and the date when this account was created
		System.out.println("Account ID:" + account.getId());
		System.out.println("Account Balance:" + account.getBalance());
		System.out.println("Monthly interest rate:" + account.getMonthlyInterest());
		System.out.println("Date account was created:" + account.getDateCreated());
	}
}
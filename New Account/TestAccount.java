//U10314010 ³¯¬M¦Ð 2018/03/10 18:30
public class TestAccount {
	// Main method
	public static void main(String[] args) {
		// Create an Account object
		Account account = new Account("George", 1122, 1000);

		// Set annual interest rate to 1.65%
		account.setAnnualInterestRate(1.65);

		// Deposit $30, $40, and $50 to the account
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);

		// withdraw $5, $4, and $2 from the account
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);

		// Print an account 
		System.out.println("Account holder name: " + account.getName());
		System.out.println("Account ID:" + account.getId());
		System.out.println("Interest rate: " + account.getAnnualInterestRate());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.println("\n     List of transactions");
		for (int i = 0; i < account.getTransactions().size(); i++) {
			System.out.println("Date: " + 
				(account.getTransactions()).get(i).getDate());
			System.out.println("Type: " + 
				(account.getTransactions()).get(i).getType());
			System.out.println("Amount: " + 
				(account.getTransactions()).get(i).getAmount());
			System.out.println("Balance: " + 
				(account.getTransactions()).get(i).getBalance());
			System.out.println("Description: " + 
				(account.getTransactions()).get(i).getDescription());
			System.out.println();
		}
	}
}
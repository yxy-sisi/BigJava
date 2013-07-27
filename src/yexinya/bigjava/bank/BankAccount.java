package yexinya.bigjava.bank;

/**
 * @author yexinya
 * 
 */
public class BankAccount {
	// instance variable
	private double balance;

	// Constructors

	/**
	 * Constructs a bank account with a given balance
	 * 
	 * @param initialBalance
	 *            the initial balance
	 */
	public BankAccount(double initialBalance) {
		super();
		this.balance = initialBalance;
	}

	/**
	 * Constructs a bank account with a zero balance
	 * Call another constructor of this class and supply the value 0
	 */
	public BankAccount() {
		this(0);
	}

	// methods
	/**
	 * Deposits money into the bank account
	 * 
	 * @param amount
	 *            the amount to deposit
	 */
	public void deposit(double amount) {
		balance = balance + amount;
	}

	/**
	 * Withdraws money from the bank account.
	 * 
	 * @param amount
	 *            the amount to withdraw
	 */
	public void withdraw(double amount) {

		balance = balance - amount;
	}

	public void monthfee() {
		this.withdraw(10);
	}

	/**
	 * Gets the current balance of the bank account.
	 * 
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}

}

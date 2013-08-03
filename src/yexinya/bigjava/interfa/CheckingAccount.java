package yexinya.bigjava.interfa;

public class CheckingAccount implements BankAccount{
private int balance;
public CheckingAccount(int balance) {
	// TODO Auto-generated constructor stub
	this.balance = balance;
	
}

public void withdraw(int amount){
	balance = balance + amount; 
}

public void deposit(int amount){
	balance = balance - amount;
}

public int getBalance(){
	System.out.println(balance);
	return balance;
	
}

public static void main(String[] args) {
	CheckingAccount ca = new CheckingAccount(400);
	ca.withdraw(100);
	ca.deposit(50);
	ca.getBalance();
}
}

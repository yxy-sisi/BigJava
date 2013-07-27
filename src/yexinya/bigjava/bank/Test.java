package yexinya.bigjava.bank;

public class Test {
public static void main(String[] args) {
	BankAccount harrysChecking =  new BankAccount();
	harrysChecking.deposit(2000);
	harrysChecking.withdraw(1500);
	System.out.println(harrysChecking.getBalance());
}
}

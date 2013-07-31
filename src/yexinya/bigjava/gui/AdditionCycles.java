package yexinya.bigjava.gui;

public class AdditionCycles {
	public int cycleLength(int n) {

		int x = n % 10 + n / 10;
		int y = (n % 10) * 10 + x % 10;
		int count = 1;

		while (y != n) {
			x = y % 10 + y / 10;
			y = (y % 10) * 10 + x % 10;
			count++;
		}
		return count;

	}
	
	public static void main(String[] args) {
		AdditionCycles n = new AdditionCycles();
		
		System.out.println(n.cycleLength(0));
	}
}

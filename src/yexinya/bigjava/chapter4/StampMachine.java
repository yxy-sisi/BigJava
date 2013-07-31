package yexinya.bigjava.chapter4;

public class StampMachine {
	private double money;

	public static final double FIRST_CLASS_STAMPS_PRICE = 0.37;

	public StampMachine() {
		money = 0;
	}

	// 存
	public void insert(double amount) {
		money += amount;
	}

	// 机器返回第一类邮票的数量
	public int giveFirstClassStamps() {
		int firstClassStamps = (int) (money / FIRST_CLASS_STAMPS_PRICE);
		money = money - firstClassStamps * FIRST_CLASS_STAMPS_PRICE;
		return firstClassStamps;

	}

	// 机器返回一美分邮票的数量 并复零
	public int givePennyStamps() {
		int pennyStamps = (int) Math.round(100 * money);
		money = 0;
		return pennyStamps;

	}

	public static void main(String[] args) {
		StampMachine sm = new StampMachine();
		sm.insert(1);
		System.out.println(sm.giveFirstClassStamps());
		System.out.println(sm.givePennyStamps());
	}
}

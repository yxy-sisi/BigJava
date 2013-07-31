package yexinya.bigjava.chapter4;

public class StampMachine {
	private double money;

	public static final double FIRST_CLASS_STAMPS_PRICE = 0.37;

	public StampMachine() {
		money = 0;
	}

	// ��
	public void insert(double amount) {
		money += amount;
	}

	// �������ص�һ����Ʊ������
	public int giveFirstClassStamps() {
		int firstClassStamps = (int) (money / FIRST_CLASS_STAMPS_PRICE);
		money = money - firstClassStamps * FIRST_CLASS_STAMPS_PRICE;
		return firstClassStamps;

	}

	// ��������һ������Ʊ������ ������
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

package yexinya.bigjava.chapter4;

public class CashRegister {
	private double purchase;
	private double payment;

	/**
	 * constructor, there is no money in the cash register
	 */
	public CashRegister() {
		purchase = 0;
		payment = 0;
	}

	/**
	 * ¼�����Ĺ����
	 * 
	 * @param amount
	 *            ��������ļ۸�
	 */
	public void recordPurchare(double amount) {// ��¼�����
		purchase = purchase + amount;
	}

	/**
	 * 
	 * @param doolars
	 * @param quarters
	 * @param dimes
	 * @param nickels
	 * @param pennies
	 */
	public void enterPayment(int dollars, int quarters, int dimes, int nickels,
			int pennies) {// ���븶��
		payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels
				* NICKEL_VALUE + pennies * PENNY_VALUE;
	}

	/**
	 * 
	 * @param change
	 *            �˿͵�������
	 */
	public double giveChange() {// �������㲢ʹ������λ
		double change = payment - purchase;

		// Ӌ��C��λ
		payment = 0;
		purchase = 0;

		return change;

	}

	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;

}
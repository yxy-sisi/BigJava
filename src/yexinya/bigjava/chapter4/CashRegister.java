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
	 * 录入货物的购买价
	 * 
	 * @param amount
	 *            所购货物的价格
	 */
	public void recordPurchare(double amount) {// 记录购买价
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
			int pennies) {// 输入付款
		payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels
				* NICKEL_VALUE + pennies * PENNY_VALUE;
	}

	/**
	 * 
	 * @param change
	 *            顾客的找零数
	 */
	public double giveChange() {// 计算找零并使机器复位
		double change = payment - purchase;

		// 計算機復位
		payment = 0;
		purchase = 0;

		return change;

	}

	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;

}
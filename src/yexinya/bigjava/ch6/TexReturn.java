package yexinya.bigjava.ch6;

import java.util.Scanner;

public class TexReturn {
	//不需要初始化
	private double income;
	private int state;

	


	public TexReturn(double income, int state) {
		super();
		this.income = income;
		this.state = state;
	}


	public double getTax() {
		double tax = 5;
		if (state == SINGLE) {
			if (income >= 0 && income <= SINGLE_GROUP1) {
				tax = income * RATE1;
			} else if (income <= SINGLE_GROUP2) {
				tax = SINGLE_GROUP1 * RATE1 + (income - SINGLE_GROUP1) * RATE2;
			} else {
				tax = SINGLE_GROUP1 * RATE1 + (SINGLE_GROUP2 - SINGLE_GROUP1) * RATE2
						+ (income - SINGLE_GROUP2) * RATE3;
			}
		}

		if (state == COUPLE) {
			if (income >= 0 && income <= COUPLE_GROUP1) {
				tax = income * RATE1;
			} else if (income <= COUPLE_GROUP2) {
				tax = COUPLE_GROUP1 * RATE1 + (income - COUPLE_GROUP1) * RATE2;
			} else {
				tax = COUPLE_GROUP1 * RATE1 + (COUPLE_GROUP2 - COUPLE_GROUP1) * RATE2
						+ (income - COUPLE_GROUP2) * RATE3;
			}
		}
		return tax;
	}
	
	

	public static final double RATE1 = 0.15;
	public static final double RATE2 = 0.28;
	public static final double RATE3 = 0.31;

	public static final int SINGLE_GROUP1 = 21450;
	public static final int SINGLE_GROUP2 = 51900;
	public static final int COUPLE_GROUP1 = 35800;
	public static final int COUPLE_GROUP2 = 86500;

	public static final int SINGLE = 1;
	public static final int COUPLE = 2;
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter income: ");
		double income = input.nextDouble();
		
		System.out.println("enter \"single\" or \"couple\": ");
		String in = input.next();
		int state = 0;
		
		if(in.equalsIgnoreCase("s")){
			state = TexReturn.SINGLE;
		}else if(in.equalsIgnoreCase("c")){
			state = TexReturn.COUPLE;
		}else{
			System.out.println("bad input");
		}
		
		TexReturn tr = new TexReturn(income, state);
		System.out.println(tr.getTax());
	}
}

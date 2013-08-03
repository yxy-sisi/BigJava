package yexinya.bigjava.ch6;

import java.util.Scanner;

public class Earthquake {
	private double richter;

	/**
	 * 
	 * @param magitude
	 */
	public Earthquake(double magitude) {

		richter = magitude;

	}

	public String getDescription() {
		String r;
		if (richter >= 8.0) {
			r = "most structures fall";
		} else if (richter >= 7.0) {
			r = "many buildings destroyed";
		} else if (richter >= 6.0) {
			r = "damage to poorly constructed buildings";
		} else if (richter >= 4.5) {
			r = "Felt by many people, no destruction";
		} else if (richter >= 0) {
			r = "Generally not felt by people";
		} else {
			r = "Negative numbers are not valid";
		}

		return r;

	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a magnitude on the rechter scale: ");
		double magnitude = input.nextDouble();
		Earthquake e = new Earthquake(magnitude);
		System.out.println(e.getDescription());
		input.close();
	}
}

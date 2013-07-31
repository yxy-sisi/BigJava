package yexinya.bigjava.chapter4;

public class StringTester {
	// string length
	public void testString(String s) {

		System.out.println(s + s.length());
	}

	// ×ªÐÍ
	public void testInteger() {
		String input = "9";
		int count1 = Integer.parseInt(input);
		double count2 = Double.parseDouble(input);
		System.out.println(count1);
		System.out.println(count2);
	}

	// subString
	public void subStrinUse() {
		String s = "Hello, world";
		String sub1 = s.substring(1, s.length() - 3);// 4-1,pastEnd - start
		String sub2 = s.substring(3);// from 3 in order to begin
		System.out.println(sub1);
		System.out.println(sub2);
	}

	// test
	public static void main(String[] args) {
		StringTester st = new StringTester();
		st.testString("Hello, world");
		st.testInteger();
		st.subStrinUse();
	}
}

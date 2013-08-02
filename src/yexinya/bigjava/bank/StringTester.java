package yexinya.bigjava.bank;

public class StringTester {
public void test(){
	String str1 = "Hello";
	String str2 = "Hello";
	//判断内容，用== 内容相等，当时通常判断string 内容 用equals
	System.out.println(str1.compareTo(str2) == 0);
}

public static void main(String[] args) {
	StringTester st = new StringTester();
	st.test();
}
}

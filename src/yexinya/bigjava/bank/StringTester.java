package yexinya.bigjava.bank;

public class StringTester {
public void test(){
	String str1 = "Hello";
	String str2 = "Hello";
	//�ж����ݣ���== ������ȣ���ʱͨ���ж�string ���� ��equals
	System.out.println(str1.compareTo(str2) == 0);
}

public static void main(String[] args) {
	StringTester st = new StringTester();
	st.test();
}
}

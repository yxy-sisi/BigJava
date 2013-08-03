package yexinya.bigjava.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
public static void main(String[] args) {
	List<String> str = new ArrayList<String>() ;
	System.out.println("size is "+ str.size());
	System.out.println("isEmpty "+ str.isEmpty());
	str.add("hello");
	str.add("hey");
	str.add("world");
	System.out.println("size is "+ str.size());
	System.out.println("isEmpty"+ str.isEmpty());
	str.remove(0);
	System.out.println("after deleted:" +str);
	str.set(1, "MAKE");
	System.out.println("after set: " +str);
	System.out.println("MAKE is aviable " + str.contains("MAK"));
	
	
}
}

package yexinya.bigjava.gui;



public class LaundryPairs {
public int SwapSocks(int[] left, int[] right){
	int result = 0;
	for (int i = 0; i < left.length; i++) {
		if(left[i] != right[i]){
			result++;
		}
	}
	return result;
	
}
	public static void main(String[] args) {
	
	
}
}

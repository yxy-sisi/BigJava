package yexinya.bigjava.flag;

import javax.swing.JFrame;

public class FlagTester {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlagComponent component = new FlagComponent();
		frame.add(component);

		frame.setVisible(true);

	}
}

package yexinya.bigjava.car;

import javax.swing.JFrame;

public class CarTester {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setSize(200,200);
	frame.setTitle("car");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	CarComponent component = new CarComponent();
	frame.add(component);
}
}

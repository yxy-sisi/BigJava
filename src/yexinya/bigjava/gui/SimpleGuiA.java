package yexinya.bigjava.gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGuiA {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		button.setSize(50, 50);

		frame.getContentPane().add(button, BorderLayout.NORTH);
		frame.setBackground(Color.GRAY);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}

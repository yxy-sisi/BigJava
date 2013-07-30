package yexinya.bigjava.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class SimpleGuiB implements ActionListener {
	Button button;

	public static void main(String[] args) {
		SimpleGuiB guiB = new SimpleGuiB();
		guiB.go();
	}

	void go() {
		JFrame frame = new JFrame();
		button = new Button("click me");

		button.addActionListener(this);
		button.setBackground(Color.BLUE);
		button.setSize(50, 50);

		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	// 真正处理事件的方法
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button.setBackground(Color.RED);

	}

}

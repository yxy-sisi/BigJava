package yexinya.bigjava.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 1. �Ȳ����Ҫ�Լ������� 2. drawPanel�Ƅ�
 * 
 * @author yexinya
 * 
 */
public class SimpleGui3TwoButton {
	JFrame frame;
	JLabel label;

	public static void main(String[] args) {
		SimpleGui3TwoButton sg3 = new SimpleGui3TwoButton();
		sg3.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton lebalButton = new JButton("label for changing colors");
		lebalButton.addActionListener(new LebalListener());// �����ӵ���ť��

		JButton colorButton = new JButton("change circle");
		colorButton.addActionListener(new ColorButton());// �����ӵ���ť��

		label = new JLabel("I am a new label");
		DrawPanel drawPanel = new DrawPanel();
		frame.getContentPane().add(lebalButton, BorderLayout.EAST);
		frame.getContentPane().add(colorButton, BorderLayout.SOUTH);
		frame.getContentPane().add(label, BorderLayout.WEST);
		frame.getContentPane().add(drawPanel, BorderLayout.CENTER);

		frame.setSize(600, 600);
		frame.setVisible(true);

	}

	class LebalListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setText("this is for label");// ����labelButtonʱ����Ӧ�仯��label�����ݣ�drawPanelֻ�仯һ��
		}

	}

	class ColorButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			frame.repaint();
		}

	}


}

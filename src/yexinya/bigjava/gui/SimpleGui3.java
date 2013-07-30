package yexinya.bigjava.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGui3 implements ActionListener{
JFrame frame;

public static void main(String[] args) {
	SimpleGui3 sg3 = new SimpleGui3();
	sg3.go();
}

public void go(){
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JButton button = new JButton("label for changing colors");
	button.addActionListener(this);//监听加到按钮上
	
	
	
	DrawPanel drawPanel = new DrawPanel();
	
	frame.getContentPane().add(button,BorderLayout.SOUTH);
	frame.getContentPane().add(drawPanel,BorderLayout.CENTER);
	frame.setSize(300, 300);
	frame.setVisible(true);
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	frame.repaint();//重绘组件
}
}

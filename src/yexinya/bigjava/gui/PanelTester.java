package yexinya.bigjava.gui;

import javax.swing.JFrame;
/**
 * ��drawpalen��������ԭ��
 * @author yexinya
 *
 */
public class PanelTester {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setSize(300, 300);
	frame.setTitle("face");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	DrawPanel drawPanel= new DrawPanel();
	frame.add(drawPanel);

}


}

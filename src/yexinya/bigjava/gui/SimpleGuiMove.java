package yexinya.bigjava.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * drawPanel移動
 * 
 * @author yexinya
 * 
 */
public class SimpleGuiMove {
	JFrame frame;
	JLabel label;
	int x = 0;
	int y = 0;

	public static void main(String[] args) {
		SimpleGuiMove sg3 = new SimpleGuiMove();
		sg3.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyDrawPanel my = new MyDrawPanel();
		frame.add(my);
		frame.setSize(300, 300);
		frame.setVisible(true);

		for (int i = 0; i < 150; i++) {
			x++;
			y++;
			my.repaint();// 重新绘制面板
			try {
				Thread.sleep(20);
			} catch (Exception e) {

			}
		}
	}

	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.GREEN);
			g.fillRect(x, y, 40, 40);
			
		}
	}

}

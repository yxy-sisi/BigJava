package yexinya.bigjava;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Calendar;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class RectangleViewer extends JComponent {

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		

		Rectangle box = new Rectangle(5, 10, 20, 30);
		g2.draw(box);
		g2.setColor(Color.blue);

		box.translate(15, 25);
		g2.draw(box);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("two box show");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new RectangleViewer());
		frame.setVisible(true);

	}
}

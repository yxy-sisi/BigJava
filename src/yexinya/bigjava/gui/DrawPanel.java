package yexinya.bigjava.gui;

import java.awt.*;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color startColor = new Color(red, green, blue);

		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		Color endColor = new Color(red, green, blue);

		GradientPaint gradient = new GradientPaint(70, 70, startColor, 150,
				150, endColor);
		g2.setPaint(gradient);
		g.fillOval(100,100, 100, 100);
	}

}

package yexinya.bigjava.car;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * this component draws two car shapes
 */
public class CarComponent extends JComponent{
public void paintComponent(Graphics g){
	Graphics2D g2 = (Graphics2D) g;
	Car car1 = new Car(0, 0);
	
	int x = getWidth() - 70;
	int y = getHeight() -40;
	Car car2 = new Car(x, y);
	
	car1.draw(g2);
	car2.draw(g2);
	
}
}

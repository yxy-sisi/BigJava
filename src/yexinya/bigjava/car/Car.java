package yexinya.bigjava.car;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * a car shape that can be positioned anywhere on the screen
 * 
 * @author yexinya
 * 
 */
public class Car {
	private int xLeft;
	private int yTop;

	/**
	 * Constructs a car with a given top left corner.
	 * 
	 * @param xLeft
	 *            the x coordinate of the top left corner
	 * @param yTop
	 *            the y coordinate of the top left corner
	 */
	public Car(int xLeft, int yTop) {
		super();
		this.xLeft = xLeft;
		this.yTop = yTop;
	}

	/**
	 * Draw the car
	 * 
	 * @param g2
	 *            the Graphics2D context
	 */
	public void draw(Graphics2D g2) {
		Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
		Ellipse2D.Double frontire = new Ellipse2D.Double(xLeft + 10, yTop + 20,
				10, 10);
		Ellipse2D.Double rearRire = new Ellipse2D.Double(xLeft + 40, yTop + 20,
				10, 10);

		Point2D.Double r1 = new Point2D.Double(xLeft + 10, yTop + 10);
		Point2D.Double r2 = new Point2D.Double(xLeft + 20, yTop);
		Point2D.Double r3 = new Point2D.Double(xLeft + 40, yTop);
		Point2D.Double r4 = new Point2D.Double(xLeft + 50, yTop + 10);

		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
// draw car
		g2.draw(body);
		g2.draw(frontire);
		g2.draw(rearRire);
		g2.draw(frontWindshield);
		g2.draw(roofTop);
		g2.draw(rearWindshield);

	}
}

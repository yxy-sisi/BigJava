package yexinya.bigjava.flag;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class FlagComponent extends JComponent{
public void paintComponent(Graphics g){
	Graphics2D g2 =  (Graphics2D) g;
	Flag flag= new Flag(100,100,90);
	flag.draw(g2);
}
}

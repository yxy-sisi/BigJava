package yexinya.bigjava;

import javax.swing.JFrame;

public class FaceViewer {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setTitle("face");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		FaceComponent component =  new FaceComponent();
		frame.add(component);
	}
	}





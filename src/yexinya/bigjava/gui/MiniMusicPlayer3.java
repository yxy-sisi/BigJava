package yexinya.bigjava.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiniMusicPlayer3 {
	static JFrame frame = new JFrame();
	static MyDrawPanel dp;

	public static void main(String[] args) {
		MiniMusicPlayer3 mini = new MiniMusicPlayer3();
		mini.go();
	}

	public void setUpGui() {
		dp = new MyDrawPanel();
		// frame.setContentPane(dp);
		frame.setTitle("music video");
		frame.add(dp,BorderLayout.CENTER);
		frame.setBounds(30, 30, 600, 600);
		frame.setVisible(true);
	}

	public void go() {
		// TODO Auto-generated method stub
		setUpGui();
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addControllerEventListener(dp, new int[] { 127 });

			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();

			int r = 0;
			for (int i = 0; i < 60; i += 4) {
				r = (int) ((Math.random() * 50) + 1);
				track.add(makeEvent(144, 1, r, 100, i));
				track.add(makeEvent(176, 1, 127, 0, i));
				track.add(makeEvent(128, 1, r, 100, i + 2));

			}
			sequencer.setSequence(seq);
			sequencer.setTempoFactor(220);
			sequencer.start();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public MidiEvent makeEvent(int command, int channel, int one, int two,
			int tick) {
		// TODO Auto-generated method stub
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(command, channel, one, two);
			event = new MidiEvent(a, tick);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return event;
	}

	// 绘图面板 内部类
	class MyDrawPanel extends JPanel implements ControllerEventListener {
//		boolean msg = false;

		@Override
		public void controlChange(ShortMessage event) {
			// TODO Auto-generated method stub
//			msg = true;
			dp.repaint();
		}

		public void painComponent(Graphics g) {
//			if (msg) {
				// Graphics2D g2 = (Graphics2D) g;
				// int red = (int) (Math.random() * 250);
				// int green = (int) (Math.random() * 250);
				// int blue = (int) (Math.random() * 250);
				//
				// g.setColor(new Color(red, green, blue));
				//
				// int height = (int) ((Math.random() * 120) + 10);
				// int width = (int) ((Math.random() * 120) + 10);
				// int x = (int) ((Math.random() * 40) + 10);
				// int y = (int) ((Math.random() * 40) + 10);
				g.setColor(Color.GREEN);
				g.fillRect(0, 0, 40, 40);
//				msg = false;
//
//			}
		}
	}

}

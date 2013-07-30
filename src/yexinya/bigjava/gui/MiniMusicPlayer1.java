package yexinya.bigjava.gui;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

public class MiniMusicPlayer1 {
public static void main(String[] args) {
	try {
		//创建并打开队列
		Sequencer seq=MidiSystem.getSequencer();
		seq.open();
		
		//创建队列并track
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}

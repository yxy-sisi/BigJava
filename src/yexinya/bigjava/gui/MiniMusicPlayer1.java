package yexinya.bigjava.gui;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

public class MiniMusicPlayer1 {
public static void main(String[] args) {
	try {
		//�������򿪶���
		Sequencer seq=MidiSystem.getSequencer();
		seq.open();
		
		//�������в�track
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}

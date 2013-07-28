package yexinya.bigjava.exception;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest {
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("succefully got a sequencer");
		} catch (MidiUnavailableException e) {
			System.out.println("bummer");
		}

	}
public static void main(String[] args) {
	MusicTest mt = new MusicTest();
	mt.play();
}
}

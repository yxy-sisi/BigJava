package yexinya.bigjava.exception;

import javax.sound.midi.*;

public class MusicTest {

	public static void main(String[] args) {
		MusicTest mt = new MusicTest();
		mt.play();
	}

	public void play() {
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();

			Sequence seq = new Sequence(Sequence.PPQ, 4);

			Track track = seq.createTrack();

			ShortMessage sm = new ShortMessage();
			sm.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(sm, 1);
			track.add(noteOn);

			ShortMessage sm2 = new ShortMessage();
			sm2.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(sm2, 16);
			track.add(noteOff);

			player.setSequence(seq);
			player.start();

			System.out.println("succefully got a sequencer");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("bummer");
		}

	}

}

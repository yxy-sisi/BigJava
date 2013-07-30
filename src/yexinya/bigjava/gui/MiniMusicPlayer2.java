package yexinya.bigjava.gui;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMusicPlayer2 implements ControllerEventListener {
	public static void main(String[] args) {
		MiniMusicPlayer2 mini = new MiniMusicPlayer2();
		mini.go();
	}

	public void go() {
		// TODO Auto-generated method stub
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();

			// 向sequencer注册事件，想要监听事件的int数组，127事件
			int[] eventsIwant = { 127 };
			sequencer.addControllerEventListener(this, eventsIwant);

			// 创建队列并track
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();

			for (int i = 5; i < 60; i += 4) {
				track.add(makeEvent(144, 1, i, 100, i));
				track.add(makeEvent(176, 1, i, 0, i));
				track.add(makeEvent(128, 1, i, 100, i + 2));
			}

			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return event;
	}

	@Override
	public void controlChange(ShortMessage event) {
		// TODO Auto-generated method stub
System.out.println("la");
	}
}

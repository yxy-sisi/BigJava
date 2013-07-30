package yexinya.bigjava.gui;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import com.sun.corba.se.spi.ior.MakeImmutable;

public class MiniMusicPlayer1 {
public static void main(String[] args) {
	try {
		//创建并打开队列
		Sequencer sequencer=MidiSystem.getSequencer();
		sequencer.open();
		
		//创建队列并track
		Sequence seq= new Sequence(Sequence.PPQ, 4);
		Track track= seq.createTrack();
		
		//创建连续的音符事件
		for (int i = 5; i <61; i+=4) {
			//调用makeEvent()来产生信息和事件，然后把他们加到track上
			track.add(makeEvent(144,1,i,100,i));
			track.add(makeEvent(128, 1, i, 100, i+2));
		}
		
		//开始播放
		sequencer.setSequence(seq);
		sequencer.setTempoInBPM(220);
		sequencer.start();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}

public static MidiEvent makeEvent(int command, int channel, int one, int two, int tick) {
	// TODO Auto-generated method stub
	MidiEvent event=null;
	try {
		ShortMessage a = new ShortMessage();
		a.setMessage(command, channel, one, two);
		event=new MidiEvent(a, tick);
	} catch (Exception e) {
		// TODO: handle exception
	}
	return event;
}
}

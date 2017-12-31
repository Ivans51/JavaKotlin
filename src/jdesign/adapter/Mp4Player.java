package jdesign.adapter;

/**
 * Created by Ivans on 9/26/2017.
 */
public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVLC(String filename) {
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Sound play: " + filename);
    }
}

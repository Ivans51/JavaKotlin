package jdesign.adapter;

/**
 * Created by Ivans on 9/26/2017.
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVLC(String filename) {
        System.out.println("Sound play: " + filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}

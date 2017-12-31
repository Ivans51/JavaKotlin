package jdesign.adapter;

/**
 * Created by Ivans on 9/26/2017.
 */
public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVLC(filename);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(filename);
        }
    }
}

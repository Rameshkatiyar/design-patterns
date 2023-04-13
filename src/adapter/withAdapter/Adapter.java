package adapter.withAdapter;

public class Adapter implements MediaPlayer{
    AdvanceMediaPlayer advanceMediaPlayer;

    public Adapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new MP4Player();
        }else if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VLCPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMP4(fileName);
        }else if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVLC(fileName);
        }
    }
}

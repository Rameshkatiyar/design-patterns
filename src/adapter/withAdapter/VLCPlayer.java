package adapter.withAdapter;

public class VLCPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing VLC file: "+fileName);
    }

    @Override
    public void playMP4(String fileName) {
        //do nothing.
    }
}

package adapter.withAdapter;

public class MP4Player implements AdvanceMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        //Do nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 file: "+fileName);
    }
}

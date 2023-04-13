package adapter.withAdapter;

public class MP3Player implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: "+fileName);
            return;
        }

        //These extra code added to support other files using adapter.
        if (audioType.equalsIgnoreCase("mp4")
                || audioType.equalsIgnoreCase("vlc")) {
            Adapter adapter = new Adapter(audioType);
            adapter.play(audioType, fileName);
            return;
        }
    }
}

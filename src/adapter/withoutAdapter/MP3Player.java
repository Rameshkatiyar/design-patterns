package adapter.withoutAdapter;

public class MP3Player implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: "+fileName);
        }else {
            System.out.println("Audio file type not supported.");
        }
    }
}

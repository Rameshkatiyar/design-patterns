package adapter.withAdapter;

public class MainTest {
    public static void main(String[] args) {
        MP3Player player = new MP3Player();
        player.play("mp3", "ABC.mp3");
        //These files now supported.
        player.play("mp4", "XYZ.mp4");
        player.play("vlc", "MNO.vlc");
    }
}

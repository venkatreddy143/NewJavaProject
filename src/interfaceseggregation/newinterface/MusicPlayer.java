package interfaceseggregation.newinterface;

public class MusicPlayer implements AudioPlayer {
    @Override
    public void playAudio() {
        System.out.println(" Playing audio ..........");
    }
}

package interfaceseggregation.newinterface;

public class VideoPlayer implements MediaPlayer {
    @Override
    public void playAudio() {
        System.out.println(" Playing audio ..........");
    }

    @Override
    public void playVideo() {
        System.out.println(" Playing video ..........");
    }

//    public boolean play(String audio,String video){
//        if (audio.equals())
//    }
}

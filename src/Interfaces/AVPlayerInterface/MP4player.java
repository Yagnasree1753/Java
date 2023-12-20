package Interfaces.AVPlayerInterface;

public class MP4player implements AVplayer {
    @Override
    public void play(){
        System.out.println("Video is playing");
    }

    @Override
    public void pause(){
        System.out.println("Video Paused");
    }

    @Override
    public void next(){
        System.out.println("next Video is playing ");
    }

    @Override
    public void previous(){
        System.out.println("Previous Video is playing");
    }
}

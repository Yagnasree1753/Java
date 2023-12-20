package Interfaces.AVPlayerInterface;

public class MP3player implements AVplayer {
    @Override
    public void play(){
        System.out.println("Music is playing");
    }

    @Override
    public void pause(){
        System.out.println("Music Paused");
    }

    @Override
    public void next(){
        System.out.println("next music is playing ");
    }

    @Override
    public void previous(){
        System.out.println("Previous music is playing");
    }
}

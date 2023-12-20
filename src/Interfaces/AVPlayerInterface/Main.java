package Interfaces.AVPlayerInterface;

public class Main {
    public static void main(String[] args){
        MP3player mp3 = new MP3player();
        mp3.play();
        mp3.pause();
        mp3.next();
        mp3.previous();

        MP4player mp4 = new MP4player();
        mp4.play();
        mp4.pause();
        mp4.next();
        mp4.previous();
    }
}

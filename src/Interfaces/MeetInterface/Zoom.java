package Interfaces.MeetInterface;

public class Zoom implements Meet {
    @Override
    public void Mute(){
        System.out.println("you were muted");
    }
    @Override
    public void UnMute(){
        System.out.println("you were unmuted");
    }
    @Override
    public void VideoOn(){
        System.out.println("your video is on");
    }
    @Override
    public void VideoOff(){
        System.out.println("your video is off");
    }
    @Override
    public void ShareScreen(){
        System.out.println("you stareted sharing yor screen");
    }
    @Override
    public void Chat(){
        System.out.println("Chat is Opened");
    }
    @Override
    public void Participants(){
        System.out.println("See the Participants");
    }
}

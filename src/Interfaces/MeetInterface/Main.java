package Interfaces.MeetInterface;

public class Main {
    public static void main(String[] args){
        Zoom zmeet = new Zoom();
        GoogleMeet gmeet = new GoogleMeet();
        MicrosoftTeams msteam = new MicrosoftTeams();
        zmeet.Mute();
        zmeet.UnMute();
        gmeet.VideoOn();
        gmeet.VideoOff();
        msteam.ShareScreen();
        msteam.Chat();
        msteam.Participants();
    }
}

public class MediaAdapter implements MediaPlayer{
    VLCPlayer vlcPlayer;
    MP4Player mp4Player;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            vlcPlayer = new VLCPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            mp4Player = new MP4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            vlcPlayer.playVLC(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            mp4Player.playMP4(fileName);
        }
    }
}

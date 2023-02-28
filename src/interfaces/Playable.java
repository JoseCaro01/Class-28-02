package interfaces;

public interface Playable {

    //public static final int volume=100;
    void tooglePauseStart();
    void play();
    void mute();
    void increaseVolume(double volume);

    void decreaseVolume(double volume);

}

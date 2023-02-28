package classes;

import interfaces.Playable;

public class PCPlayer implements Playable {
    private final int MAX_VOLUME = 10;
    private int volume = 0;

    @Override
    public void tooglePauseStart() {

    }

    @Override
    public void play() {

    }

    @Override
    public void mute() {

    }

    @Override
    public void increaseVolume(double volume) {

        this.volume= this.volume + volume >= MAX_VOLUME ? MAX_VOLUME : (int) (this.volume + volume);
    }

    @Override
    public void decreaseVolume(double volume) {

    }
}

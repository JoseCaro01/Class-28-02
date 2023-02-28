package classes;

import interfaces.Playable;
import interfaces.ShoppingFunc;

public class IOSPlayer implements Playable, ShoppingFunc {

    private final double MAX_VOLUME = 1.0;
    private double volume = 0;

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
        this.volume= Math.min(this.volume + volume, MAX_VOLUME);
    }

    @Override
    public void decreaseVolume(double volume) {

    }

    @Override
    public void buy() {

    }
}

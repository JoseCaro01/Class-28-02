package classes;

import interfaces.Playable;

public class AndroidPlayer implements Playable {

    private final int MAX_VOLUME = 100;

    private int volume=0;

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
        if (this.volume+volume >= MAX_VOLUME) {
            this.volume = MAX_VOLUME;
            System.out.println("Volumen maximo en android alcanzado");
        } else {
            this.volume += volume;
        }
    }

    @Override
    public void decreaseVolume(double volume) {

    }

}

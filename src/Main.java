import abstracts.Person;
import abstracts.Profesor;
import classes.AndroidPlayer;
import classes.IOSPlayer;
import exercise_interfaces.PaymentList;
import interfaces.Playable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IOSPlayer iosPlayer = new IOSPlayer();
        iosPlayer.increaseVolume(100);
        AndroidPlayer androidPlayer = new AndroidPlayer();
        androidPlayer.increaseVolume(50);


        IOSPlayer[] iosPlayers = {iosPlayer};

        //Arrays de interfaz (Puede contener clases que implementen dicha interfaz)
        Playable[] playables = {iosPlayer, androidPlayer};

        //Para verficar el tipo de la clase que implementa la interfaz
        if (playables[0] instanceof IOSPlayer) {

        }
        //Arrays dinamicos (Lo mismo que los Arrays pero con la capacidad de poder añadirles contenido una vez creados)
        List<IOSPlayer> iosPlayerList = new ArrayList<>();
        iosPlayerList.add(iosPlayer);

        // Clases abstractas (Se puede trabajar de igual manera que las interfaces de arriba referente a los Arrays y el instanceof)

        Profesor person = new Profesor("Jose", LocalDate.now());

        Person[] persons = {person};


        if (persons[0] instanceof Profesor) {

        }

        //Exercise Interfaces

        PaymentList paymentList = new PaymentList(null);
        System.out.println(paymentList.getLastTransaction());

    }
}
//Pause
//Rep
//Favoritos
//Siguiente cancion

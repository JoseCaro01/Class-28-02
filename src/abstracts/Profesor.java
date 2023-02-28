package abstracts;

import interfaces.Playable;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Profesor extends Person {

    private String horario;

    public String getHorario() {
        return horario;
    }


    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Profesor(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public void comer() {

    }
}

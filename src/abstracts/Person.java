package abstracts;

import java.time.LocalDate;

public abstract class Person {

    private String name;
    private LocalDate dateOfBirth;

    public Person() {
        setName("Sin nombre");
        dateOfBirth = LocalDate.now();
    }

    public Person(String name) {
        setName(name);
        dateOfBirth = LocalDate.now();
    }

    public Person(String name, LocalDate dateOfBirth) {
        setName(name);
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Nombre invalido");
        }
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public abstract void comer();
}

package Task7;

import java.time.LocalDate;
import java.time.Period;


public abstract class Person {
    String fio;
    String birthdate;

    public int getAge() {
        if (!this.birthdate.isEmpty()) {
            return Period.between(LocalDate.parse(this.birthdate), LocalDate.now()).getYears();
        } else return 0;
    }

    public String getFio() {
        return fio;
    }
}
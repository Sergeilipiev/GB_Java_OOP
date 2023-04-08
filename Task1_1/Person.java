package Task1_1;

import java.time.LocalDate;
import java.time.Period;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {
    String fio;
    String birthdate;

    public int getAge() {
        if (!this.birthdate.isEmpty()) {
            return Period.between(LocalDate.parse(this.birthdate), LocalDate.now()).getYears();
        }
        else return 0;
    }
}
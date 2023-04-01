package Lesson1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Man {
    private String fio;
    private final String birthdate;
    private Man father;
    private Man mother;
    private Man sister;
    private Man brother;
    private ArrayList<Man> childs = new ArrayList<Man>();

    public Man(String fio, String birthDate) {
        this.fio = fio;
        this.birthdate = birthDate;
    }

    public int getAge() {
        return Period.between(LocalDate.parse(this.birthdate), LocalDate.now()).getYears();
    }

    public Man getFather() {
        return father;
    }

    public void setFather(Man father) {
        this.father = father;
    }

    public Man getMother() {
        return mother;
    }

    public void setMother(Man mother) {
        this.mother = mother;
    }

    public ArrayList<Man> getChilds() {
        return childs;
    }

    public void addChild(Man child, Man mother, Man father) {
//        if (mother.getAge() > 12) this.mother = mother;
//        if (father.getAge() > 12) this.father = father;
        this.childs.add(child);
    }

    public Man getSister() {
        return sister;
    }

    public void setSister(Man sister) {
        this.sister = sister;
    }

    public Man getBrother() {
        return brother;
    }

    public void setBrother(Man brother) {
        this.brother = brother;
    }

    @Override
    public String toString() {
        return "Lesson1.Man{" +
                "fio='" + fio + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", father=" + father +
                ", mother=" + mother +
                ", sister=" + sister +
                ", brother=" + brother +
                ", childs=" + childs +
                '}';
    }
}

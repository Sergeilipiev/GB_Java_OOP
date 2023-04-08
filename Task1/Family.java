package Task1;

import java.util.ArrayList;

public class Family extends Person{
    private Family father;
    private Family mother;
    private ArrayList<Family> sisters = new ArrayList<>();
    private ArrayList<Family> brothers = new ArrayList<>();
    private ArrayList<Family> childrens = new ArrayList<>();

    public Family(String fio, String birthDate) {
        this.fio = fio;
        this.birthdate = birthDate;
    }

    public Family(String fio) {
        this.fio = fio;
    }



    public ArrayList<Family> getSisters() {
        return sisters;
    }

    public ArrayList<Family> getBrothers() {
        return brothers;
    }

    public void setBrothers(Family brother) {
        this.brothers.add(brother);
    }

    public ArrayList<Family> getChildrens() {
        return childrens;
    }

    public void addChild(Family child, Family mother, Family father) {
        if (mother.getAge() > 12) child.mother = mother;
        if (father.getAge() > 12) child.father = father;
        if (!mother.getChildrens().isEmpty()) {
            for (Family ignored : mother.getChildrens()) {
                if (!mother.getChildrens().contains(child)) {
                    ignored.setBrothers(child);
                }
            }
        }
        this.childrens.add(child);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(fio).append("\n");
        sb.append("Возраст: ").append(this.getAge()).append("\n");
        sb.append("Father: ");
        if (father != null) {
            sb.append(father.fio);
        } else {
            sb.append("Unknown");
        }
        sb.append("\n");
        sb.append("Mother: ");
        if (mother != null) {
            sb.append(mother.fio);
        } else {
            sb.append("Unknown");
        }sb.append("\n");
        sb.append("Brothers: ");
        extract1(sb, brothers);
        sb.append("Children: ");
        extract1(sb, childrens);
        return sb.toString();
    }

    private void extract1(StringBuilder sb, ArrayList<Family> brothers) {
        if (brothers.size() > 0) {
            sb.append("\n");
            for (Family brother : brothers) {
                sb.append(brother.fio).append(", ");
            }
            sb.setLength(sb.length() - 2);
        } else {
            sb.append("None");
        }
        sb.append("\n");
    }
}
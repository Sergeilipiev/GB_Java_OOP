package Task6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Family implements FamilyOperations {
    private String fullName;
    private String birthDate;
    private Family father;
    private Family mother;
    private ArrayList<Family> sisters = new ArrayList<>();
    private ArrayList<Family> brothers = new ArrayList<>();
    private ArrayList<Family> children = new ArrayList<>();

    public Family(String fullName, String birthDate) {
        this.fullName = fullName;
        this.birthDate = birthDate;
    }

    public Family(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        if (!this.birthDate.isEmpty()) {
            return Period.between(LocalDate.parse(this.birthDate), LocalDate.now()).getYears();
        } else return 0;
    }

    @Override
    public ArrayList<Family> getSisters() {
        return sisters;
    }

    @Override
    public ArrayList<Family> getBrothers() {
        return brothers;
    }

    @Override
    public void addBrother(Family brother) {
        this.brothers.add(brother);
    }

    @Override
    public ArrayList<Family> getChildren() {
        return children;
    }

    @Override
    public void addChild(Family child, Family mother, Family father) {
        if (mother.getAge() > 12) child.mother = mother;
        if (father.getAge() > 12) child.father = father;
        if (!mother.getChildren().isEmpty()) {
            for (Family ignored : mother.getChildren()) {
                if (!mother.getChildren().contains(child)) {
                    ignored.addBrother(child);
                }
            }
        }
        this.children.add(child);
    }
}

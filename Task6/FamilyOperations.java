package Task6;

import java.util.ArrayList;

public interface FamilyOperations {
    ArrayList<Family> getSisters();
    ArrayList<Family> getBrothers();
    void addBrother(Family brother);
    ArrayList<Family> getChildren();
    void addChild(Family child, Family mother, Family father);
}

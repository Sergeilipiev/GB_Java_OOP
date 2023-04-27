package Task4;

public abstract class Shield {
    private String name;
    private int defense;

    public Shield(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public String toString() {
        return "Shield{" +
                "name='" + name + '\'' +
                ", defense=" + defense +
                '}';
    }
}

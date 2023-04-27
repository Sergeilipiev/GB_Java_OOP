package Task4;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        archers.addPersons(new Archer("Robin", 100, new Bow(20), new WoodenShield()))
                .addPersons(new Archer("Bobin", 100, new Bow(15), new WoodenShield()));
        knights.addPersons(new Knight("John", 150, new Knife(), new SteelShield()))
                .addPersons(new Knight("Adam", 150, new Knife(), new SteelShield()));

        Archer archer1 = new Archer("Robin", 100, new Bow(20), new WoodenShield());
        Archer archer2 = new Archer("Bobin", 100, new Bow(15), new NoShield());
        Battle fight = new Battle(archer1, archer2);
        fight.run();
    }
}

